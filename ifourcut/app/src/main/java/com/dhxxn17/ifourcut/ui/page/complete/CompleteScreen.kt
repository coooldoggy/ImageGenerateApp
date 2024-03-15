package com.dhxxn17.ifourcut.ui.page.complete

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.dhxxn17.ifourcut.R
import com.dhxxn17.ifourcut.ui.base.BaseScreen

class CompleteScreen (
    private val viewModel: CompleteViewModel,
    private val navController: NavController,
    private val imageUrl: String
): BaseScreen() {

    @Composable
    override fun CreateContent() {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White)
                .padding(horizontal = 24.dp, vertical = 12.dp),
            verticalArrangement = Arrangement.Top
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_back),
                    contentDescription = "",
                    modifier = Modifier.size(28.dp)
                        .clickable {
                            navController.popBackStack()
                        }
                )
            }

            Spacer(modifier = Modifier.height(24.dp))

            Image(
                painter = painterResource(id = R.drawable.preview),
                contentDescription = "",
                modifier = Modifier
                    .fillMaxWidth()
                    .heightIn(400.dp)
            )

            Spacer(modifier = Modifier.weight(1f))

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        top = 24.dp,
                        bottom = 36.dp
                    )
            ) {
                Button(
                    onClick = {

                    },
                    modifier = Modifier
                        .weight(1f)
                        .height(58.dp),
                    shape = RoundedCornerShape(100.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor= Color(0xffFFF8EE),
                        contentColor= Color(0xffFFF8EE),
                        disabledContainerColor= Color(0xffFFFFFF),
                        disabledContentColor= Color(0xffFFFFFF),
                    )

                ) {
                    Text(
                        text = "Download",
                        fontSize = 16.sp,
                        color = Color(0xffFF9800)
                    )
                }

                Spacer(modifier = Modifier.width(16.dp))

                Button(
                    onClick = {

                    },
                    modifier = Modifier
                        .weight(1f)
                        .height(58.dp),
                    shape = RoundedCornerShape(100.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor= Color(0xffFF9800),
                        contentColor= Color(0xffFF9800),
                        disabledContainerColor= Color(0xffFFF8EE),
                        disabledContentColor= Color(0xffFFF8EE),
                    )

                ) {
                    Text(
                        text = "Share",
                        fontSize = 16.sp,
                        color = Color.White
                    )
                }
            }
        }
    }

}