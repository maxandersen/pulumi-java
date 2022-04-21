// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.timestream.inputs;

import com.pulumi.awsnative.timestream.enums.ScheduledQueryMultiMeasureAttributeMappingMeasureValueType;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * An attribute mapping to be used for mapping query results to ingest data for multi-measure attributes.
 * 
 */
public final class ScheduledQueryMultiMeasureAttributeMappingArgs extends com.pulumi.resources.ResourceArgs {

    public static final ScheduledQueryMultiMeasureAttributeMappingArgs Empty = new ScheduledQueryMultiMeasureAttributeMappingArgs();

    @Import(name="measureValueType", required=true)
    private Output<ScheduledQueryMultiMeasureAttributeMappingMeasureValueType> measureValueType;

    public Output<ScheduledQueryMultiMeasureAttributeMappingMeasureValueType> measureValueType() {
        return this.measureValueType;
    }

    @Import(name="sourceColumn", required=true)
    private Output<String> sourceColumn;

    public Output<String> sourceColumn() {
        return this.sourceColumn;
    }

    @Import(name="targetMultiMeasureAttributeName")
    private @Nullable Output<String> targetMultiMeasureAttributeName;

    public Optional<Output<String>> targetMultiMeasureAttributeName() {
        return Optional.ofNullable(this.targetMultiMeasureAttributeName);
    }

    private ScheduledQueryMultiMeasureAttributeMappingArgs() {}

    private ScheduledQueryMultiMeasureAttributeMappingArgs(ScheduledQueryMultiMeasureAttributeMappingArgs $) {
        this.measureValueType = $.measureValueType;
        this.sourceColumn = $.sourceColumn;
        this.targetMultiMeasureAttributeName = $.targetMultiMeasureAttributeName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ScheduledQueryMultiMeasureAttributeMappingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ScheduledQueryMultiMeasureAttributeMappingArgs $;

        public Builder() {
            $ = new ScheduledQueryMultiMeasureAttributeMappingArgs();
        }

        public Builder(ScheduledQueryMultiMeasureAttributeMappingArgs defaults) {
            $ = new ScheduledQueryMultiMeasureAttributeMappingArgs(Objects.requireNonNull(defaults));
        }

        public Builder measureValueType(Output<ScheduledQueryMultiMeasureAttributeMappingMeasureValueType> measureValueType) {
            $.measureValueType = measureValueType;
            return this;
        }

        public Builder measureValueType(ScheduledQueryMultiMeasureAttributeMappingMeasureValueType measureValueType) {
            return measureValueType(Output.of(measureValueType));
        }

        public Builder sourceColumn(Output<String> sourceColumn) {
            $.sourceColumn = sourceColumn;
            return this;
        }

        public Builder sourceColumn(String sourceColumn) {
            return sourceColumn(Output.of(sourceColumn));
        }

        public Builder targetMultiMeasureAttributeName(@Nullable Output<String> targetMultiMeasureAttributeName) {
            $.targetMultiMeasureAttributeName = targetMultiMeasureAttributeName;
            return this;
        }

        public Builder targetMultiMeasureAttributeName(String targetMultiMeasureAttributeName) {
            return targetMultiMeasureAttributeName(Output.of(targetMultiMeasureAttributeName));
        }

        public ScheduledQueryMultiMeasureAttributeMappingArgs build() {
            $.measureValueType = Objects.requireNonNull($.measureValueType, "expected parameter 'measureValueType' to be non-null");
            $.sourceColumn = Objects.requireNonNull($.sourceColumn, "expected parameter 'sourceColumn' to be non-null");
            return $;
        }
    }

}
