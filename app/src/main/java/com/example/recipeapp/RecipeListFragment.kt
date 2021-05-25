package com.example.recipeapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController


class RecipeListFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment


        return ComposeView(requireContext()).apply {
            setContent {

                Column(modifier = Modifier.padding(16.dp)) {
                    Text(text = "Recipe List ", fontSize = 21.sp)
                    Spacer(modifier = Modifier.padding(10.dp))
                    Button(onClick = {
                        findNavController().navigate(R.id.action_recipeListFragment_to_recipeFragment)
                    }) {
                        Text(text = "To RECIPE FRAGMENT")
                    }

                }


            }
        }


//        view.findViewById<ComposeView>(R.id.compose_view).setContent {
//
//            Column(
//                modifier = Modifier
//                    .border(border = BorderStroke(1.dp, Color.Black))
//                    .padding(16.dp)
//            ) {
//                Text(text = "First Item")
//                Spacer(modifier = Modifier.padding(10.dp))
//                CircularProgressIndicator()
//                Spacer(modifier = Modifier.padding(10.dp))
//                Text(text = "Second Item")
//                Spacer(modifier = Modifier.padding(10.dp))
//            }
//
//        }
//
//
//        return view
    }


}