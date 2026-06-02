package com.example.andevformula.assesments.ui_practice_screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.ChevronRight
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.outlined.DarkMode
import androidx.compose.material.icons.outlined.Info
import androidx.compose.material.icons.outlined.Language
import androidx.compose.material.icons.outlined.Lock
import androidx.compose.material.icons.outlined.Logout
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material3.Card
import androidx.compose.material3.DividerDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun SettingsScreen() {

    var isCheckedNotification by remember { mutableStateOf(false) }
    var isCheckedDarkMode by remember { mutableStateOf(false) }
    // Main Column for the entire screen
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp)
    ) {
        // Row for the header My Profile & Settings Icon
        Row(
            modifier = Modifier
                .padding(top = 16.dp)
        ) {


            //Box for the Settings Icon
            Box(
                modifier = Modifier
                    .weight(0.10f)
                    .background(
                        color = Color(0xFFf1f1f1),
                        shape = RoundedCornerShape(8.dp)
                    ),
                contentAlignment = Alignment.Center,

                ) {
                // Settings Icon
                Icon(
                    imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                    contentDescription = "Settings",
                    modifier = Modifier
                        .padding(4.dp),
                    tint = Color(0xFF09040a)
                )
            }

            // Spacer for separation between Icon and Text
            Spacer(modifier = Modifier.width(16.dp))

            // Settings Text
            Text(
                text = "Settings",
                modifier = Modifier
                    .weight(0.90f),
                textAlign = TextAlign.Start,
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold
            )

        } // Row for the header My Profile & Settings Icon

        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 12.dp)


        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(
                        color = Color(0xFFf4f4f4),
                        shape = RoundedCornerShape(12.dp)
                    )
            ) {

                Icon(
                    imageVector = Icons.Default.Search,
                    contentDescription = "Search",
                    modifier = Modifier
                        .padding(16.dp),
                    tint = Color(0xFF606060)
                )

                Text(
                    text = "Search settings...",
                    modifier = Modifier
                        .align(Alignment.CenterVertically),
                    fontSize = 18.sp,
                    color = Color(0xFFacacac),
                    fontWeight = FontWeight.Medium
                )
            } // Row for Search Bar
        } // Card for Search Bar

        // Account Text
        Text(
            text = "ACCOUNT",
            textAlign = TextAlign.Start,
            fontSize = 14.sp,
            letterSpacing = 2.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.SansSerif,
            color = Color(0xFFbababa)
        )

        Card(
            modifier = Modifier
                .padding(vertical = 12.dp)
        ) {
            Column(

            ) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(
                            color = Color(0xFFf6f6f6),
                            shape = RoundedCornerShape(
                                topStart = 12.dp,
                                topEnd = 12.dp
                            )
                        )
                ) {

                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 8.dp)
                            .background(
                                color = Color(0xFFf6f6f6),
                                shape = RoundedCornerShape(12.dp)
                            )
                    ) {

                        Box(
                            modifier = Modifier
                                .padding(start = 8.dp)
                                .align(Alignment.CenterVertically),
                            contentAlignment = Alignment.Center
                        ) {

                            Icon(
                                imageVector = Icons.Outlined.Person,
                                contentDescription = "Account Info",
                                modifier = Modifier.padding(8.dp),
                                tint = Color(0xFF606060)
                            )
                        }

                        Text(
                            text = "Account Info",
                            modifier = Modifier
                                .align(Alignment.CenterVertically)
                                .padding(vertical = 16.dp, horizontal = 8.dp),
                            fontSize = 16.sp,
                            color = Color(0xFF09040a),
                            fontWeight = FontWeight.Medium
                        )
                    }
                } // Box for Account Info

                val color = Color(0xFFefecec)
                HorizontalDivider(
                    thickness = DividerDefaults.Thickness,
                    color = color
                )

                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(
                            color = Color(0xFFf6f6f6),
                        )
                ) {

                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 8.dp)
                            .background(
                                color = Color(0xFFf6f6f6),
                                shape = RoundedCornerShape(12.dp)
                            )
                    ) {

                        Box(
                            modifier = Modifier
                                .padding(start = 8.dp)
                                .align(Alignment.CenterVertically),
                            contentAlignment = Alignment.Center
                        ) {

                            Icon(
                                imageVector = Icons.Outlined.Notifications,
                                contentDescription = "Notifications",
                                modifier = Modifier.padding(8.dp),
                                tint = Color(0xFF606060)
                            )
                        }

                        Text(
                            text = "Notifications",
                            modifier = Modifier
                                .align(Alignment.CenterVertically)
                                .padding(vertical = 16.dp, horizontal = 8.dp),
                            fontSize = 16.sp,
                            color = Color(0xFF09040a),
                            fontWeight = FontWeight.Medium
                        )

                        Spacer(modifier = Modifier.weight(1f))

                        Switch(
                            checked = isCheckedNotification,
                            modifier = Modifier
                                .align(Alignment.CenterVertically)
                                .padding(horizontal = 8.dp),
                            onCheckedChange = {
                                isCheckedNotification = it
                            },
                            colors = SwitchDefaults.colors(
                                checkedThumbColor = Color.White,
                                checkedTrackColor = Color(0xFF34C759),
                                uncheckedBorderColor = Color.Transparent,
                                uncheckedThumbColor = Color(0xFFffffff),
                                uncheckedTrackColor = Color(0xFFd0d0d5)
                            )
                        ) // Switch for Notifications
                    }
                } // Box for Notifications

                HorizontalDivider(
                    thickness = DividerDefaults.Thickness,
                    color = color
                )

                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(
                            color = Color(0xFFf6f6f6),
                        )
                ) {

                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 8.dp)
                            .background(
                                color = Color(0xFFf6f6f6),
                                shape = RoundedCornerShape(12.dp)
                            )
                    ) {

                        Box(
                            modifier = Modifier
                                .padding(start = 8.dp)
                                .align(Alignment.CenterVertically),
                            contentAlignment = Alignment.Center
                        ) {

                            Icon(
                                imageVector = Icons.Outlined.DarkMode,
                                contentDescription = "Dark Mode",
                                modifier = Modifier.padding(8.dp),
                                tint = Color(0xFF606060)
                            )
                        }

                        Text(
                            text = "Dark Mode",
                            modifier = Modifier
                                .align(Alignment.CenterVertically)
                                .padding(vertical = 16.dp, horizontal = 8.dp),
                            fontSize = 16.sp,
                            color = Color(0xFF09040a),
                            fontWeight = FontWeight.Medium
                        )

                        Spacer(modifier = Modifier.weight(1f))

                        Switch(
                            checked = isCheckedDarkMode,
                            modifier = Modifier
                                .align(Alignment.CenterVertically)
                                .padding(horizontal = 8.dp),

                            onCheckedChange = {
                                isCheckedDarkMode = it
                            },
                            colors = SwitchDefaults.colors(
                                checkedThumbColor = Color.White,
                                checkedTrackColor = Color(0xFF34C759),
                                uncheckedBorderColor = Color.Transparent,
                                uncheckedThumbColor = Color(0xFFffffff),
                                uncheckedTrackColor = Color(0xFFd0d0d5)
                            )


                        ) // Switch for Dark Mode
                    }
                } // Box for Notifications
            }
        }  // Card for Account Info

        // PREFERENCES Text
        Text(
            text = "PREFERENCES",
            textAlign = TextAlign.Start,
            fontSize = 14.sp,
            letterSpacing = 2.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.SansSerif,
            color = Color(0xFFbababa)
        )

        Card(
            modifier = Modifier
                .padding(vertical = 12.dp)
        ) {
            Column(

            ) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(
                            color = Color(0xFFf6f6f6),
                            shape = RoundedCornerShape(
                                topStart = 12.dp,
                                topEnd = 12.dp
                            )
                        )
                ) {

                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 8.dp)
                            .background(
                                color = Color(0xFFf6f6f6),
                                shape = RoundedCornerShape(12.dp)
                            )
                    ) {

                        Box(
                            modifier = Modifier
                                .padding(start = 8.dp)
                                .align(Alignment.CenterVertically),
                            contentAlignment = Alignment.Center
                        ) {

                            Icon(
                                imageVector = Icons.Outlined.Language,
                                contentDescription = "Language",
                                modifier = Modifier.padding(8.dp),
                                tint = Color(0xFF606060)
                            )
                        }

                        Text(
                            text = "Language",
                            modifier = Modifier
                                .align(Alignment.CenterVertically)
                                .padding(vertical = 16.dp, horizontal = 8.dp),
                            fontSize = 16.sp,
                            color = Color(0xFF09040a),
                            fontWeight = FontWeight.Medium
                        )

                        Spacer(modifier = Modifier.weight(0.75f))

                        Text(
                            text = "English",
                            modifier = Modifier
                                .align(Alignment.CenterVertically)
//                                .align(Arrangement.End as Alignment.Vertical)
//                                .weight(1f)
                                .padding(vertical = 16.dp, horizontal = 8.dp),
                            fontSize = 14.sp,
                            color = Color(0xFF999999)
//                            fontWeight = FontWeight.Medium
                        )

                        Spacer(modifier = Modifier.weight(0.25f))

                        // Arrow Icon
                        Icon(
                            imageVector = Icons.Default.ChevronRight,
                            contentDescription = "Settings",
                            modifier = Modifier
                                .align(Alignment.CenterVertically)
                                .padding(4.dp),
                            tint = Color(0xFFc7c7c7)
                        )

                    }
                } // Box for Language

                val color = Color(0xFFefecec)
                HorizontalDivider(
                    thickness = DividerDefaults.Thickness,
                    color = color
                )

                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(
                            color = Color(0xFFf6f6f6),
                        )
                ) {

                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 8.dp)
                            .background(
                                color = Color(0xFFf6f6f6),
                                shape = RoundedCornerShape(12.dp)
                            )
                    ) {

                        Box(
                            modifier = Modifier
                                .padding(start = 8.dp)
                                .align(Alignment.CenterVertically),
                            contentAlignment = Alignment.Center
                        ) {

                            Icon(
                                imageVector = Icons.Outlined.Lock,
                                contentDescription = "Privacy",
                                modifier = Modifier.padding(8.dp),
                                tint = Color(0xFF606060)
                            )
                        }

                        Text(
                            text = "Privacy",
                            modifier = Modifier
                                .align(Alignment.CenterVertically)
                                .padding(vertical = 16.dp, horizontal = 8.dp),
                            fontSize = 16.sp,
                            color = Color(0xFF09040a),
                            fontWeight = FontWeight.Medium
                        )

                        Spacer(modifier = Modifier.weight(1f))

                        // Arrow Icon
                        Icon(
                            imageVector = Icons.Default.ChevronRight,
                            contentDescription = "Settings",
                            modifier = Modifier
                                .align(Alignment.CenterVertically)
                                .padding(4.dp),
                            tint = Color(0xFFc7c7c7)
                        )
                    }
                } // Box for preferences

            }
        }  // Card for PREFERENCES

        // About Text
        Text(
            text = "ABOUT",
            textAlign = TextAlign.Start,
            fontSize = 14.sp,
            letterSpacing = 2.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.SansSerif,
            color = Color(0xFFbababa)
        )

        Card(
            modifier = Modifier
                .padding(vertical = 12.dp)
        ) {
            Column(

            ) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(
                            color = Color(0xFFf6f6f6),
                            shape = RoundedCornerShape(
                                topStart = 12.dp,
                                topEnd = 12.dp
                            )
                        )
                ) {

                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 8.dp)
                            .background(
                                color = Color(0xFFf6f6f6),
                                shape = RoundedCornerShape(12.dp)
                            )
                    ) {

                        Box(
                            modifier = Modifier
                                .padding(start = 8.dp)
                                .align(Alignment.CenterVertically),
                            contentAlignment = Alignment.Center
                        ) {

                            Icon(
                                imageVector = Icons.Outlined.Language,
                                contentDescription = "Language",
                                modifier = Modifier.padding(8.dp),
                                tint = Color(0xFF606060)
                            )
                        }

                        Text(
                            text = "Terms of Service",
                            modifier = Modifier
                                .align(Alignment.CenterVertically)
                                .padding(vertical = 16.dp, horizontal = 8.dp),
                            fontSize = 16.sp,
                            color = Color(0xFF09040a),
                            fontWeight = FontWeight.Medium
                        )

                        Spacer(modifier = Modifier.weight(0.75f))

                        Text(
                            text = "English",
                            modifier = Modifier
                                .align(Alignment.CenterVertically)
//                                .align(Arrangement.End as Alignment.Vertical)
//                                .weight(1f)
                                .padding(vertical = 16.dp, horizontal = 8.dp),
                            fontSize = 14.sp,
                            color = Color(0xFF999999)
//                            fontWeight = FontWeight.Medium
                        )

                        Spacer(modifier = Modifier.weight(0.25f))

                        // Arrow Icon
                        Icon(
                            imageVector = Icons.Default.ChevronRight,
                            contentDescription = "Settings",
                            modifier = Modifier
                                .align(Alignment.CenterVertically)
                                .padding(4.dp),
                            tint = Color(0xFFc7c7c7)
                        )

                    }
                } // Box for Language

                val color = Color(0xFFefecec)
                HorizontalDivider(
                    thickness = DividerDefaults.Thickness,
                    color = color
                )

                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(
                            color = Color(0xFFf6f6f6),
                        )
                ) {

                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 8.dp)
                            .background(
                                color = Color(0xFFf6f6f6),
                                shape = RoundedCornerShape(12.dp)
                            )
                    ) {

                        Box(
                            modifier = Modifier
                                .padding(start = 8.dp)
                                .align(Alignment.CenterVertically),
                            contentAlignment = Alignment.Center
                        ) {

                            Icon(
                                imageVector = Icons.Outlined.Info,
                                contentDescription = "App Version",
                                modifier = Modifier.padding(8.dp),
                                tint = Color(0xFF606060)
                            )
                        }

                        Text(
                            text = "App Version",
                            modifier = Modifier
                                .align(Alignment.CenterVertically)
                                .padding(vertical = 16.dp, horizontal = 8.dp),
                            fontSize = 16.sp,
                            color = Color(0xFF09040a),
                            fontWeight = FontWeight.Medium
                        )

                        Spacer(modifier = Modifier.weight(1f))

                        // Version
                        Text(
                            text = "v2.4.1",
                            modifier = Modifier
                                .align(Alignment.CenterVertically)
//                                .align(Arrangement.End as Alignment.Vertical)
//                                .weight(1f)
                                .padding(vertical = 16.dp, horizontal = 16.dp),
                            fontSize = 14.sp,
                            color = Color(0xFF999999),
                            fontWeight = FontWeight.SemiBold
                        )
                    }
                } // Box for About
            }
        }  // Card for About

        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 12.dp)


        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(
                        color = Color(0xFFf4f4f4),
                        shape = RoundedCornerShape(12.dp)
                    )
            ) {

                Icon(
                    imageVector = Icons.Outlined.Logout,
                    contentDescription = "Logout",
                    modifier = Modifier
                        .padding(16.dp),
                    tint = Color(0xFFef4444)
                )

                Text(
                    text = "Log Out",
                    modifier = Modifier
                        .align(Alignment.CenterVertically),
                    fontSize = 18.sp,
                    color = Color(0xFFef4444),
                    fontWeight = FontWeight.SemiBold
                )
            } // Row for Logout
        } // Card for Logout
    }// Main Column for the entire screen
}
