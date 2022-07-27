package com.example.mvvm_retrofit.model



import com.google.gson.annotations.Expose

import com.google.gson.annotations.SerializedName


class PostModel {
    @SerializedName("status")
    @Expose
    var status: Int? = null

    @SerializedName("data")
    @Expose
    var data: List<DataModel>? = null

    @SerializedName("message")
    @Expose
    var message: String? = null


    class DataModel {
        @SerializedName("course_level")
        @Expose
        var courseLevel: String? = null

        @SerializedName("course_level_id")
        @Expose
        var courseLevelId: String? = null
        @Expose

        @SerializedName("total_credit")
        var totalCredit: Int? = null

        @SerializedName("credits_used")
        @Expose
        var creditsUsed: Int? = null

        @SerializedName("status")
        @Expose
        var status: String? = null

        @SerializedName("package_expiry_date")
        @Expose
        var packageExpiryDate: String? = null

        @SerializedName("student_id")
        @Expose
        var studentId: String? = null

        @SerializedName("name")
        @Expose
        var name: String? = null

        @SerializedName("email")
        @Expose
        var email: String? = null

        @SerializedName("phone_number")
        @Expose
        var phoneNumber: String? = null

        @SerializedName("validity_extension")
        @Expose
        var validityExtension: Int? = null

        @SerializedName("verification_status")
        @Expose
        var verificationStatus: Int? = null

        @SerializedName("_id")
        @Expose
        var id: String? = null

    }

}