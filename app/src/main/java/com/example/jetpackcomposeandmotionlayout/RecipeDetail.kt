package com.example.jetpackcomposeandmotionlayout

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ExperimentalMotionApi
import androidx.constraintlayout.compose.MotionLayout
import androidx.constraintlayout.compose.MotionScene
import androidx.constraintlayout.compose.rememberMotionLayoutState
import com.example.jetpackcomposeandmotionlayout.ui.theme.background_blue

@OptIn(ExperimentalMotionApi::class)
@Preview
@Composable
fun RecipeDetail() {
    val context = LocalContext.current
    val motionScene = remember {
        context.resources
            .openRawResource(R.raw.motion_scene_s)
            .readBytes()
            .decodeToString()
    }
    val motionState = rememberMotionLayoutState()
//    val corners = 10f - ((motionState.currentProgress * 10)).coerceAtMost(10f)

    MotionLayout(
        motionLayoutState = motionState,
        motionScene = MotionScene(content = motionScene),
        modifier = Modifier
            .fillMaxSize()
            .background(
                color = background_blue
            )
    ) {

        Card(
            modifier = Modifier
                .padding(16.dp)
                .width(350.dp)
                .height(537.dp)

                .layoutId("card"),
            elevation = 18.dp,
            shape = RoundedCornerShape(16.dp)
        ) {

        }
        Image(
            painter = painterResource(id = R.drawable.ic_leaf_1), contentDescription = "",
            modifier = Modifier.layoutId("leaf1")
        )

        Image(
            painter = painterResource(id = R.drawable.ic_leaf_2), contentDescription = "",
            modifier = Modifier.layoutId("leaf2")
        )


        Image(
            painter = painterResource(id = R.drawable.ic_android_robot), contentDescription = "",
            modifier = Modifier.layoutId("robot")
        )

        Image(
            painter = painterResource(id = R.drawable.ic_leaf_4), contentDescription = "",
            modifier = Modifier.layoutId("leaf4")
        )

        Image(
            painter = painterResource(id = R.drawable.ic_leaf_5), contentDescription = "",
            modifier = Modifier.layoutId("leaf5")
        )

        Image(
            painter = painterResource(id = R.drawable.ic_cloud), contentDescription = "",
            modifier = Modifier.layoutId("cloud")
        )

        Text(
            text = "Welcome", textAlign = TextAlign.Center,
            fontWeight = FontWeight.SemiBold,
            modifier = Modifier.layoutId("welcome"), color = background_blue
        )

    }

}
