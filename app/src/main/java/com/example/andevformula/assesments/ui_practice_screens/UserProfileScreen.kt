package com.example.andevformula.assesments.ui_practice_screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ChevronRight
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.outlined.Cake
import androidx.compose.material.icons.outlined.LocationOn
import androidx.compose.material.icons.outlined.Phone
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material3.Card
import androidx.compose.material3.DividerDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun UserProfileScreen() {

//    var boxSize by remember { mutableIntStateOf(0) }
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
            // My Profile Text
            Text(
                text = "My Profile",
                modifier = Modifier
                    .weight(0.90f),
                textAlign = TextAlign.Start,
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold
            )

            //Box for the Settings Icon
            Box(
                modifier = Modifier
                    .weight(0.10f)
                    .background(
                        color = Color(0xFFf1f1f1),
                        shape = RoundedCornerShape(12.dp)
                    ),
                contentAlignment = Alignment.Center,

                ) {
                // Settings Icon
                Icon(
                    imageVector = Icons.Outlined.Settings,
                    contentDescription = "Settings",
                    modifier = Modifier
                        .padding(4.dp),
                    tint = Color(0xFF09040a)
                )
            }
        }

        // Box for the Profile Picture
        Box(
            modifier = Modifier
                .padding(top = 32.dp)
                .align(Alignment.CenterHorizontally)
        ) {
            Box(
                modifier = Modifier
                    .size(120.dp)
                    .shadow(
                        elevation = 24.dp,
                        shape = CircleShape
                    )
                    .background(
                        color = Color(0xFF6f5fbe),
                        shape = CircleShape
                    ),
                contentAlignment = Alignment.Center
            ) {
//                val fontSize = with(LocalDensity.current) {
//                    (boxSize.toDp() * 0.5f).toSp()
//                }
                // 50% of box width
                Text(
                    text = "D",
                    color = Color(0xFFffffff),
//                    fontSize = fontSize
                    fontSize = 56.sp
                )
            }
        }

        // UserName Text
        Text(
            text = "Daksh Dagar",
            modifier = Modifier
                .padding(top = 16.dp)
                .align(Alignment.CenterHorizontally),
            fontSize = 28.sp,
            fontWeight = FontWeight.SemiBold,
        )

        // User Email Text
        Text(
            text = "dagar.daksh@email.com",
            modifier = Modifier
                .padding(top = 8.dp)
                .align(Alignment.CenterHorizontally),
            fontSize = 18.sp,
            fontWeight = FontWeight.W400,
            color = Color(0xFF8a8a8a)
        )

        // Spacer
        Spacer(
            modifier = Modifier
                .size(12.dp)
                .align(Alignment.CenterHorizontally)
        )

        // Button for Edit Profile
        Box(
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .background(
                    color = Color(0xFF1a1a1a),
                    shape = RoundedCornerShape(24.dp)
                )
                .padding(horizontal = 32.dp, vertical = 12.dp),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "Edit Profile",
                color = Color.White,
                fontSize = 18.sp,
                fontWeight = FontWeight.Medium
            )
        }

        // Spacer
        Spacer(
            modifier = Modifier
                .size(18.dp)
                .align(Alignment.CenterHorizontally)
        )

        HorizontalDivider(
            thickness = DividerDefaults.Thickness,
            color = DividerDefaults.color
        )

        // Spacer
        Spacer(
            modifier = Modifier.size(16.dp)
        )


        Row(

            modifier = Modifier.padding(horizontal = 12.dp)
        ) {

            Column(
                modifier = Modifier.padding(horizontal = 12.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Text(
                    text = "24",
                    fontSize = 24.sp,
                    fontWeight = FontWeight.SemiBold
                )

                Text(
                    text = "POSTS",
                    fontSize = 14.sp,
                    fontFamily = FontFamily.SansSerif,
                    color = Color(0xFF999999),
                    fontWeight = FontWeight.W400,
                    letterSpacing = 1.sp

                )

            }

            VerticalDivider(
                modifier = Modifier
                    .height(48.dp)
                    .padding(horizontal = 14.dp),
                thickness = DividerDefaults.Thickness,
                color = DividerDefaults.color,

                )

            Column(
                modifier = Modifier.padding(horizontal = 12.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Text(
                    text = "1.2K",
                    fontSize = 24.sp,
                    fontWeight = FontWeight.SemiBold
                )

                Text(
                    text = "FOLLOWERS",
                    fontSize = 14.sp,
                    color = Color(0xFF999999),
                    fontFamily = FontFamily.SansSerif,
                    fontWeight = FontWeight.W400,
                    letterSpacing = 1.sp
                )

            }

            VerticalDivider(
                modifier = Modifier
                    .height(48.dp)
                    .padding(horizontal = 12.dp),
                thickness = DividerDefaults.Thickness,
                color = DividerDefaults.color,

                )


            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Text(
                    text = "340",
                    fontSize = 24.sp,
                    fontWeight = FontWeight.SemiBold
                )

                Text(
                    text = "FOLLOWING",
                    fontSize = 14.sp,
                    color = Color(0xFF999999),
                    fontFamily = FontFamily.SansSerif,
                    fontWeight = FontWeight.W400,
                    letterSpacing = 1.sp
                )
            }
        }

        Spacer(
            modifier = Modifier.size(16.dp)
        )

        HorizontalDivider(
            thickness = DividerDefaults.Thickness,
            color = DividerDefaults.color
        )

        // Spacer
        Spacer(
            modifier = Modifier.size(16.dp)
        )

        Text(
            text = "PERSONAL INFO",
            textAlign = TextAlign.Start,
            fontSize = 14.sp,
            letterSpacing = 2.sp,
            fontWeight = FontWeight.SemiBold,
            fontFamily = FontFamily.SansSerif,
            color = Color(0xFFbfbfbf)

        )

        // Spacer
        Spacer(
            modifier = Modifier.size(16.dp)
        )


        Row(
            modifier = Modifier.padding(top = 14.dp, bottom = 14.dp)
        ) {

            //Box for the Settings Icon
            Box(
                modifier = Modifier
                    .weight(0.10f)
                    .align(Alignment.CenterVertically)
                    .background(
                        color = Color(0xFFf1f1f1),
                        shape = RoundedCornerShape(12.dp)
                    ),
                contentAlignment = Alignment.Center,

                ) {
                // Settings Icon
                Icon(
                    imageVector = Icons.Outlined.Phone,
                    contentDescription = "Settings",
                    modifier = Modifier
                        .padding(4.dp),
                    tint = Color(0xFF545454)
                )
            }

            Column(
                modifier = Modifier
                    .weight(0.8f)
                    .padding(start = 16.dp)
            ) {


                Text(
                    text = "Phone",
                    fontSize = 14.sp,
                    color = Color(0xFF999999),
                    fontWeight = FontWeight.W400,
                    letterSpacing = 0.5.sp
                )

                Text(
                    text = "+91 9217018212",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.SemiBold,
                    fontFamily = FontFamily.SansSerif
                )
            }

            // Arrow Icon
            Icon(
                imageVector = Icons.Default.ChevronRight,
                contentDescription = "Settings",
                modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .padding(4.dp),
                tint = Color(0xFFd0d0d0)
            )
        }

        HorizontalDivider(
            thickness = DividerDefaults.Thickness,
            color = DividerDefaults.color
        )

        Row(
            modifier = Modifier.padding(top = 14.dp, bottom = 14.dp)
        ) {

            //Box for the Settings Icon
            Box(
                modifier = Modifier
                    .weight(0.10f)
                    .align(Alignment.CenterVertically)
                    .background(
                        color = Color(0xFFf1f1f1),
                        shape = RoundedCornerShape(12.dp)
                    ),
                contentAlignment = Alignment.Center,

                ) {

                // Location Icon

                Icon(
                    imageVector = Icons.Outlined.LocationOn,
                    contentDescription = "Settings",
                    modifier = Modifier
                        .padding(4.dp),
                    tint = Color(0xFF545454)
                )
            }

            Column(
                modifier = Modifier
                    .weight(0.8f)
                    .padding(start = 16.dp)
            ) {


                Text(
                    text = "Location",
                    fontSize = 14.sp,
                    color = Color(0xFF999999),
                    fontWeight = FontWeight.W400,
                    letterSpacing = 0.5.sp
//                    modifier = Modifier.padding(bottom = 4.dp)
                )

                Text(
                    text = "Mumbai, India",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.SemiBold,
                    letterSpacing = 0.5.sp,
                    fontFamily = FontFamily.SansSerif
                )
            }

            // Arrow Icon
            Icon(
                imageVector = Icons.Default.ChevronRight,
                contentDescription = "Settings",
                modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .padding(4.dp),
                tint = Color(0xFFd0d0d0)
            )
        }

        HorizontalDivider(
            thickness = DividerDefaults.Thickness,
            color = DividerDefaults.color
        )
        Row(
            modifier = Modifier.padding(top = 14.dp, bottom = 14.dp)
        ) {

            //Box for the Settings Icon
            Box(
                modifier = Modifier
                    .weight(0.10f)
                    .align(Alignment.CenterVertically)
                    .background(
                        color = Color(0xFFf1f1f1),
                        shape = RoundedCornerShape(12.dp)
                    ),
                contentAlignment = Alignment.Center

            ) {
                // Birthday Icon
                Icon(
                    imageVector = Icons.Outlined.Cake,
                    contentDescription = "Settings",
                    modifier = Modifier
                        .padding(4.dp),
                    tint = Color(0xFF545454)
                )
            }

            Column(
                modifier = Modifier
                    .weight(0.8f)
                    .padding(start = 16.dp)
            ) {


                Text(
                    text = "Birthday",
                    fontSize = 14.sp,
                    color = Color(0xFF999999),
                    fontWeight = FontWeight.W400,
                    letterSpacing = 1.sp
//                    modifier = Modifier.padding(bottom = 4.dp)
                )

                Text(
                    text = "December 24, 2009",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.SemiBold
                )
            }

            // Arrow Icon
            Icon(
                imageVector = Icons.Default.ChevronRight,
                contentDescription = "Settings",
                modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .padding(4.dp),
                tint = Color(0xFFd0d0d0)
            )
        }

        // Spacer
        Spacer(
            modifier = Modifier.size(16.dp)
        )

        // Upgrade to Pro Card

        Card(

        ) {
            Row(

            ) {
                //Box for the Star Icon
                Box(
                    modifier = Modifier
                        .padding(start = 16.dp)
                        .align(Alignment.CenterVertically)
                        .defaultMinSize(minWidth = 36.dp, minHeight = 36.dp)
                        .background(
                            color = Color(0xFF7158b5),
                            shape = RoundedCornerShape(10.dp)
                        ),
                    contentAlignment = Alignment.Center,
                ) {
                    // Star Icon
                    Icon(
                        imageVector = Icons.Filled.Star,
                        contentDescription = "Settings",
                        modifier = Modifier
                            .padding(4.dp),
                        tint = Color(0xFFFFFFFF)
                    )
                }

                Column(
                    modifier = Modifier
                        .weight(0.7f)
                        .padding(16.dp)
                ) {

                    Text(
                        text = "Upgrade to Pro",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                        fontFamily = FontFamily.SansSerif
                    )

                    Text(
                        text = "Unlock all premium features.",
                        fontSize = 14.sp,
                        color = Color(0xFF999999),
                        letterSpacing = 0.5.sp,
                        modifier = Modifier
                            .padding(top = 4.dp)
                    )
                }

                // Box for the Pro Text

                Box(
                    modifier = Modifier
                        .weight(0.2f)
                        .align(Alignment.CenterVertically)
                        .padding(end = 16.dp)
                        .background(
                                color = Color(0xFF667de9),
                                shape = RoundedCornerShape(16.dp)
                            ),
                    contentAlignment = Alignment.Center
                ) {
                    // Pro Text
                    Text(
                        text = "PRO",
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFFffffff),
                        modifier = Modifier
//                        .weight(0.15f)
//                            .align(Alignment.CenterVertically)
                            .padding(4.dp)
//                            .background(
//                                color = Color(0xFFf1f1f1),
//                                shape = RoundedCornerShape(10.dp)
//                            )
                    )
                }
            }
        }
    }
}






