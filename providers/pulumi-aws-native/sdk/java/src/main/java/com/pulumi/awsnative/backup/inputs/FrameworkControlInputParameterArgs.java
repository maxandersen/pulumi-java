// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.backup.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class FrameworkControlInputParameterArgs extends com.pulumi.resources.ResourceArgs {

    public static final FrameworkControlInputParameterArgs Empty = new FrameworkControlInputParameterArgs();

    @Import(name="parameterName", required=true)
    private Output<String> parameterName;

    public Output<String> parameterName() {
        return this.parameterName;
    }

    @Import(name="parameterValue", required=true)
    private Output<String> parameterValue;

    public Output<String> parameterValue() {
        return this.parameterValue;
    }

    private FrameworkControlInputParameterArgs() {}

    private FrameworkControlInputParameterArgs(FrameworkControlInputParameterArgs $) {
        this.parameterName = $.parameterName;
        this.parameterValue = $.parameterValue;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FrameworkControlInputParameterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FrameworkControlInputParameterArgs $;

        public Builder() {
            $ = new FrameworkControlInputParameterArgs();
        }

        public Builder(FrameworkControlInputParameterArgs defaults) {
            $ = new FrameworkControlInputParameterArgs(Objects.requireNonNull(defaults));
        }

        public Builder parameterName(Output<String> parameterName) {
            $.parameterName = parameterName;
            return this;
        }

        public Builder parameterName(String parameterName) {
            return parameterName(Output.of(parameterName));
        }

        public Builder parameterValue(Output<String> parameterValue) {
            $.parameterValue = parameterValue;
            return this;
        }

        public Builder parameterValue(String parameterValue) {
            return parameterValue(Output.of(parameterValue));
        }

        public FrameworkControlInputParameterArgs build() {
            $.parameterName = Objects.requireNonNull($.parameterName, "expected parameter 'parameterName' to be non-null");
            $.parameterValue = Objects.requireNonNull($.parameterValue, "expected parameter 'parameterValue' to be non-null");
            return $;
        }
    }

}
