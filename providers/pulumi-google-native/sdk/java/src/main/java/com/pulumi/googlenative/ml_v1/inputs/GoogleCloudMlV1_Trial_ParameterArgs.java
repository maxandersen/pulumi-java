// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.ml_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A message representing a parameter to be tuned. Contains the name of the parameter and the suggested value to use for this trial.
 * 
 */
public final class GoogleCloudMlV1_Trial_ParameterArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudMlV1_Trial_ParameterArgs Empty = new GoogleCloudMlV1_Trial_ParameterArgs();

    /**
     * Must be set if ParameterType is DOUBLE or DISCRETE.
     * 
     */
    @Import(name="floatValue")
    private @Nullable Output<Double> floatValue;

    /**
     * @return Must be set if ParameterType is DOUBLE or DISCRETE.
     * 
     */
    public Optional<Output<Double>> floatValue() {
        return Optional.ofNullable(this.floatValue);
    }

    /**
     * Must be set if ParameterType is INTEGER
     * 
     */
    @Import(name="intValue")
    private @Nullable Output<String> intValue;

    /**
     * @return Must be set if ParameterType is INTEGER
     * 
     */
    public Optional<Output<String>> intValue() {
        return Optional.ofNullable(this.intValue);
    }

    /**
     * The name of the parameter.
     * 
     */
    @Import(name="parameter")
    private @Nullable Output<String> parameter;

    /**
     * @return The name of the parameter.
     * 
     */
    public Optional<Output<String>> parameter() {
        return Optional.ofNullable(this.parameter);
    }

    /**
     * Must be set if ParameterTypeis CATEGORICAL
     * 
     */
    @Import(name="stringValue")
    private @Nullable Output<String> stringValue;

    /**
     * @return Must be set if ParameterTypeis CATEGORICAL
     * 
     */
    public Optional<Output<String>> stringValue() {
        return Optional.ofNullable(this.stringValue);
    }

    private GoogleCloudMlV1_Trial_ParameterArgs() {}

    private GoogleCloudMlV1_Trial_ParameterArgs(GoogleCloudMlV1_Trial_ParameterArgs $) {
        this.floatValue = $.floatValue;
        this.intValue = $.intValue;
        this.parameter = $.parameter;
        this.stringValue = $.stringValue;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudMlV1_Trial_ParameterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudMlV1_Trial_ParameterArgs $;

        public Builder() {
            $ = new GoogleCloudMlV1_Trial_ParameterArgs();
        }

        public Builder(GoogleCloudMlV1_Trial_ParameterArgs defaults) {
            $ = new GoogleCloudMlV1_Trial_ParameterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param floatValue Must be set if ParameterType is DOUBLE or DISCRETE.
         * 
         * @return builder
         * 
         */
        public Builder floatValue(@Nullable Output<Double> floatValue) {
            $.floatValue = floatValue;
            return this;
        }

        /**
         * @param floatValue Must be set if ParameterType is DOUBLE or DISCRETE.
         * 
         * @return builder
         * 
         */
        public Builder floatValue(Double floatValue) {
            return floatValue(Output.of(floatValue));
        }

        /**
         * @param intValue Must be set if ParameterType is INTEGER
         * 
         * @return builder
         * 
         */
        public Builder intValue(@Nullable Output<String> intValue) {
            $.intValue = intValue;
            return this;
        }

        /**
         * @param intValue Must be set if ParameterType is INTEGER
         * 
         * @return builder
         * 
         */
        public Builder intValue(String intValue) {
            return intValue(Output.of(intValue));
        }

        /**
         * @param parameter The name of the parameter.
         * 
         * @return builder
         * 
         */
        public Builder parameter(@Nullable Output<String> parameter) {
            $.parameter = parameter;
            return this;
        }

        /**
         * @param parameter The name of the parameter.
         * 
         * @return builder
         * 
         */
        public Builder parameter(String parameter) {
            return parameter(Output.of(parameter));
        }

        /**
         * @param stringValue Must be set if ParameterTypeis CATEGORICAL
         * 
         * @return builder
         * 
         */
        public Builder stringValue(@Nullable Output<String> stringValue) {
            $.stringValue = stringValue;
            return this;
        }

        /**
         * @param stringValue Must be set if ParameterTypeis CATEGORICAL
         * 
         * @return builder
         * 
         */
        public Builder stringValue(String stringValue) {
            return stringValue(Output.of(stringValue));
        }

        public GoogleCloudMlV1_Trial_ParameterArgs build() {
            return $;
        }
    }

}
