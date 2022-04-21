// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kinesis.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AnalyticsApplicationInputsStartingPositionConfigurationGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final AnalyticsApplicationInputsStartingPositionConfigurationGetArgs Empty = new AnalyticsApplicationInputsStartingPositionConfigurationGetArgs();

    /**
     * The starting position on the stream. Valid values: `LAST_STOPPED_POINT`, `NOW`, `TRIM_HORIZON`.
     * 
     */
    @Import(name="startingPosition")
    private @Nullable Output<String> startingPosition;

    public Optional<Output<String>> startingPosition() {
        return Optional.ofNullable(this.startingPosition);
    }

    private AnalyticsApplicationInputsStartingPositionConfigurationGetArgs() {}

    private AnalyticsApplicationInputsStartingPositionConfigurationGetArgs(AnalyticsApplicationInputsStartingPositionConfigurationGetArgs $) {
        this.startingPosition = $.startingPosition;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AnalyticsApplicationInputsStartingPositionConfigurationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AnalyticsApplicationInputsStartingPositionConfigurationGetArgs $;

        public Builder() {
            $ = new AnalyticsApplicationInputsStartingPositionConfigurationGetArgs();
        }

        public Builder(AnalyticsApplicationInputsStartingPositionConfigurationGetArgs defaults) {
            $ = new AnalyticsApplicationInputsStartingPositionConfigurationGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder startingPosition(@Nullable Output<String> startingPosition) {
            $.startingPosition = startingPosition;
            return this;
        }

        public Builder startingPosition(String startingPosition) {
            return startingPosition(Output.of(startingPosition));
        }

        public AnalyticsApplicationInputsStartingPositionConfigurationGetArgs build() {
            return $;
        }
    }

}
