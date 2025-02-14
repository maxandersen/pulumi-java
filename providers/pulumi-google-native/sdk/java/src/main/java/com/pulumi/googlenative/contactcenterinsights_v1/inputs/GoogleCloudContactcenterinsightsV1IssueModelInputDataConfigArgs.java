// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.contactcenterinsights_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.contactcenterinsights_v1.enums.GoogleCloudContactcenterinsightsV1IssueModelInputDataConfigMedium;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Configs for the input data used to create the issue model.
 * 
 */
public final class GoogleCloudContactcenterinsightsV1IssueModelInputDataConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudContactcenterinsightsV1IssueModelInputDataConfigArgs Empty = new GoogleCloudContactcenterinsightsV1IssueModelInputDataConfigArgs();

    /**
     * A filter to reduce the conversations used for training the model to a specific subset.
     * 
     */
    @Import(name="filter")
    private @Nullable Output<String> filter;

    /**
     * @return A filter to reduce the conversations used for training the model to a specific subset.
     * 
     */
    public Optional<Output<String>> filter() {
        return Optional.ofNullable(this.filter);
    }

    /**
     * Medium of conversations used in training data. This field is being deprecated. To specify the medium to be used in training a new issue model, set the `medium` field on `filter`.
     * 
     */
    @Import(name="medium")
    private @Nullable Output<GoogleCloudContactcenterinsightsV1IssueModelInputDataConfigMedium> medium;

    /**
     * @return Medium of conversations used in training data. This field is being deprecated. To specify the medium to be used in training a new issue model, set the `medium` field on `filter`.
     * 
     */
    public Optional<Output<GoogleCloudContactcenterinsightsV1IssueModelInputDataConfigMedium>> medium() {
        return Optional.ofNullable(this.medium);
    }

    private GoogleCloudContactcenterinsightsV1IssueModelInputDataConfigArgs() {}

    private GoogleCloudContactcenterinsightsV1IssueModelInputDataConfigArgs(GoogleCloudContactcenterinsightsV1IssueModelInputDataConfigArgs $) {
        this.filter = $.filter;
        this.medium = $.medium;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudContactcenterinsightsV1IssueModelInputDataConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudContactcenterinsightsV1IssueModelInputDataConfigArgs $;

        public Builder() {
            $ = new GoogleCloudContactcenterinsightsV1IssueModelInputDataConfigArgs();
        }

        public Builder(GoogleCloudContactcenterinsightsV1IssueModelInputDataConfigArgs defaults) {
            $ = new GoogleCloudContactcenterinsightsV1IssueModelInputDataConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param filter A filter to reduce the conversations used for training the model to a specific subset.
         * 
         * @return builder
         * 
         */
        public Builder filter(@Nullable Output<String> filter) {
            $.filter = filter;
            return this;
        }

        /**
         * @param filter A filter to reduce the conversations used for training the model to a specific subset.
         * 
         * @return builder
         * 
         */
        public Builder filter(String filter) {
            return filter(Output.of(filter));
        }

        /**
         * @param medium Medium of conversations used in training data. This field is being deprecated. To specify the medium to be used in training a new issue model, set the `medium` field on `filter`.
         * 
         * @return builder
         * 
         */
        public Builder medium(@Nullable Output<GoogleCloudContactcenterinsightsV1IssueModelInputDataConfigMedium> medium) {
            $.medium = medium;
            return this;
        }

        /**
         * @param medium Medium of conversations used in training data. This field is being deprecated. To specify the medium to be used in training a new issue model, set the `medium` field on `filter`.
         * 
         * @return builder
         * 
         */
        public Builder medium(GoogleCloudContactcenterinsightsV1IssueModelInputDataConfigMedium medium) {
            return medium(Output.of(medium));
        }

        public GoogleCloudContactcenterinsightsV1IssueModelInputDataConfigArgs build() {
            return $;
        }
    }

}
