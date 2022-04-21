// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.ml_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GoogleCloudMlV1_StudyConfigParameterSpec_IntegerValueSpecArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudMlV1_StudyConfigParameterSpec_IntegerValueSpecArgs Empty = new GoogleCloudMlV1_StudyConfigParameterSpec_IntegerValueSpecArgs();

    /**
     * Must be specified if type is `INTEGER`. Maximum value of the parameter.
     * 
     */
    @Import(name="maxValue")
    private @Nullable Output<String> maxValue;

    public Optional<Output<String>> maxValue() {
        return Optional.ofNullable(this.maxValue);
    }

    /**
     * Must be specified if type is `INTEGER`. Minimum value of the parameter.
     * 
     */
    @Import(name="minValue")
    private @Nullable Output<String> minValue;

    public Optional<Output<String>> minValue() {
        return Optional.ofNullable(this.minValue);
    }

    private GoogleCloudMlV1_StudyConfigParameterSpec_IntegerValueSpecArgs() {}

    private GoogleCloudMlV1_StudyConfigParameterSpec_IntegerValueSpecArgs(GoogleCloudMlV1_StudyConfigParameterSpec_IntegerValueSpecArgs $) {
        this.maxValue = $.maxValue;
        this.minValue = $.minValue;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudMlV1_StudyConfigParameterSpec_IntegerValueSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudMlV1_StudyConfigParameterSpec_IntegerValueSpecArgs $;

        public Builder() {
            $ = new GoogleCloudMlV1_StudyConfigParameterSpec_IntegerValueSpecArgs();
        }

        public Builder(GoogleCloudMlV1_StudyConfigParameterSpec_IntegerValueSpecArgs defaults) {
            $ = new GoogleCloudMlV1_StudyConfigParameterSpec_IntegerValueSpecArgs(Objects.requireNonNull(defaults));
        }

        public Builder maxValue(@Nullable Output<String> maxValue) {
            $.maxValue = maxValue;
            return this;
        }

        public Builder maxValue(String maxValue) {
            return maxValue(Output.of(maxValue));
        }

        public Builder minValue(@Nullable Output<String> minValue) {
            $.minValue = minValue;
            return this;
        }

        public Builder minValue(String minValue) {
            return minValue(Output.of(minValue));
        }

        public GoogleCloudMlV1_StudyConfigParameterSpec_IntegerValueSpecArgs build() {
            return $;
        }
    }

}
