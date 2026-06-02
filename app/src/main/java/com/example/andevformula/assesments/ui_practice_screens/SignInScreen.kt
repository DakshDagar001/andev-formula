package com.example.andevformula.assesments.ui_practice_screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material.icons.outlined.Lock
import androidx.compose.material.icons.outlined.Visibility
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.andevformula.R

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun SignINScreen() {


    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp)
    ) {

        Box(
            contentAlignment = Alignment.Center
        ) {

            Image(
                painter = painterResource(R.drawable.sign_in_icon),
                contentDescription = "Sign In Icon",
                modifier = Modifier
                    .padding(top = 16.dp)
                    .width(72.dp)
                    .height(72.dp)
                    .clip(RoundedCornerShape(12.dp)),
                contentScale = ContentScale.Crop

            )
        } // Box for Image

        Spacer(modifier = Modifier.height(32.dp))

        Text(
            text = "Welcome back!",
            modifier = Modifier.padding(bottom = 8.dp),
            color = Color.Black,
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold,
            letterSpacing = 1.sp
        )

        Text(
            text = "Sign in to your account to continue",
            modifier = Modifier.padding(bottom = 16.dp),
            color = Color(0xFF999999),
            fontSize = 16.sp,
            fontWeight = FontWeight.Normal,
            letterSpacing = 1.sp
        )

        Spacer(modifier = Modifier.height(32.dp))

        // EMAIL ADDRESS
        Text(
            text = "EMAIL ADDRESS",
            textAlign = TextAlign.Start,
            fontSize = 14.sp,
            letterSpacing = 2.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.SansSerif,
            color = Color(0xFF6a6a6a)
        )

        Spacer(modifier = Modifier.height(8.dp))

        OutlinedTextField(
            value = "",
            onValueChange = {},
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp),
            shape = RoundedCornerShape(16.dp),
            placeholder = { Text(text = "Enter your email address") },
            singleLine = true,
            leadingIcon = {
                Icon(
                    imageVector = Icons.Outlined.Email,
                    contentDescription = "Email Icon",
//                    tint = Color(0xFFacacac)
                )
            },
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = Color(0xFF667de9),
                unfocusedBorderColor = Color(0xFFacacac),
                focusedContainerColor = Color(0xFFf0f2ff),
                unfocusedContainerColor = Color(0xFFf5f5f5),
                focusedTextColor = Color(0xFF1a1a1a),
                unfocusedTextColor = Color(0xFFbfbfbf),
                unfocusedPlaceholderColor = Color(0xFFbfbfbf),
                focusedLeadingIconColor = Color(0xFF667de9),
                unfocusedLeadingIconColor = Color(0xFFacacac),
            )
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Password
        Text(
            text = "PASSWORD",
            textAlign = TextAlign.Start,
            fontSize = 14.sp,
            letterSpacing = 2.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.SansSerif,
            color = Color(0xFF6a6a6a)
        )

        Spacer(modifier = Modifier.height(8.dp))

        OutlinedTextField(
            value = "",
            onValueChange = {},
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp),
            shape = RoundedCornerShape(16.dp),
            placeholder = { Text(text = "Enter your password") },
            singleLine = true,
            leadingIcon = {
                Icon(
                    imageVector = Icons.Outlined.Lock,
                    contentDescription = "Email Icon",
//                    tint = Color(0xFFacacac)
                )
            },
            trailingIcon = {
                Icon(
                    imageVector = Icons.Outlined.Visibility,
                    contentDescription = "Visibility Icon",
//                tint = Color(0xFFacacac)
                )
            },
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = Color(0xFF667de9),
                unfocusedBorderColor = Color(0xFFacacac),
                focusedContainerColor = Color(0xFFf0f2ff),
                unfocusedContainerColor = Color(0xFFf5f5f5),
                focusedTextColor = Color(0xFF1a1a1a),
                unfocusedTextColor = Color(0xFFbfbfbf),
                unfocusedPlaceholderColor = Color(0xFFbfbfbf),
                focusedLeadingIconColor = Color(0xFF667de9),
                unfocusedLeadingIconColor = Color(0xFFacacac),
                focusedTrailingIconColor = Color(0xFF667de9),
                unfocusedTrailingIconColor = Color(0xFFacacac)
            )
        )

//        Spacer(modifier = Modifier.height(16.dp))

        // Forgot Password
        Text(
            text = "Forgot password?",
            modifier = Modifier
                .align(Alignment.End)
                .padding(top = 8.dp),
            color = Color(0xFF667de9),
            fontSize = 16.sp,
            fontWeight = FontWeight.Medium,
            letterSpacing = 1.sp
        )

        Spacer(modifier = Modifier.height(32.dp))

        Button(
            onClick = { /* Handle sign in */ },
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp),
            shape = RoundedCornerShape(16.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF1a1a1a),
                contentColor = Color.White
            )
        ) {
            Text(
                text = "Sign In",
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                letterSpacing = 1.sp
            )
        }

        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {

            HorizontalDivider(
                modifier = Modifier
                    .padding(vertical = 24.dp)
                    .weight(0.45f),
                color = Color(0xFFebebeb),
                thickness = 1.dp
            )

            Text(
                text = " OR ",
                modifier = Modifier.weight(0.1f),
                color = Color(0xFFbfbfbf),
                fontSize = 14.sp,
                textAlign = TextAlign.Center
            )

            HorizontalDivider(
                modifier = Modifier
                    .padding(vertical = 24.dp)
                    .weight(0.45f),
                color = Color(0xFFebebeb),
                thickness = 1.dp
            )
        }

//        Spacer(modifier = Modifier.height(8.dp))

        Button(
            onClick = { /* Handle sign in */ },
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp),
            border = BorderStroke(
                width = 1.dp,
                color = Color(0xFFe7e7e7)
            ),
            shape = RoundedCornerShape(16.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFFf5f5f5),
                contentColor = Color.Black,
            )
        ) {
            Image(
                painter = painterResource(R.drawable.icon_google),
                contentDescription = "Google Icon",
                modifier = Modifier
                    .width(24.dp)
                    .height(24.dp)
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(
                text = "Continue with Google",
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                letterSpacing = 1.sp
            )
        }

        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
//                .padding(top = 24.dp)
        ) {
            Text(
                text = "Don't have an account? ",
                modifier = Modifier.padding(top = 24.dp),
                color = Color(0xFF6a6a6a),
                fontSize = 14.sp,
                fontWeight = FontWeight.Normal,
                letterSpacing = 1.sp
            )

            Text(
                text = "Sign Up",
                modifier = Modifier
                    .padding(top = 24.dp)
                    .clickable { },
                color = Color(0xFF667de9),
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold,
                letterSpacing = 1.sp
            )
        }

    } // Main Column
}
