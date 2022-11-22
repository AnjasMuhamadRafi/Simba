package kampus.merdeka.simbaapp.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


@Parcelize
class ModelPosyandu (

    var imgPosyandu: Int = 0,
    var namePosyandu: String ? = null,
    var descPosyandu: String ? = null
) : Parcelable