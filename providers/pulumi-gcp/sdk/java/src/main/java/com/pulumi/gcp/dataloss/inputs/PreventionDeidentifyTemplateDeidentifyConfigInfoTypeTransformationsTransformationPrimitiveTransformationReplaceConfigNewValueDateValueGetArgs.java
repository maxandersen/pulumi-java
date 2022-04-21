// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataloss.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigNewValueDateValueGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigNewValueDateValueGetArgs Empty = new PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigNewValueDateValueGetArgs();

    /**
     * Day of month. Must be from 1 to 31 and valid for the year and month, or 0 if specifying a
     * year by itself or a year and month where the day is not significant.
     * 
     */
    @Import(name="day")
    private @Nullable Output<Integer> day;

    public Optional<Output<Integer>> day() {
        return Optional.ofNullable(this.day);
    }

    /**
     * Month of year. Must be from 1 to 12, or 0 if specifying a year without a month and day.
     * 
     */
    @Import(name="month")
    private @Nullable Output<Integer> month;

    public Optional<Output<Integer>> month() {
        return Optional.ofNullable(this.month);
    }

    /**
     * Year of date. Must be from 1 to 9999, or 0 if specifying a date without a year.
     * 
     */
    @Import(name="year")
    private @Nullable Output<Integer> year;

    public Optional<Output<Integer>> year() {
        return Optional.ofNullable(this.year);
    }

    private PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigNewValueDateValueGetArgs() {}

    private PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigNewValueDateValueGetArgs(PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigNewValueDateValueGetArgs $) {
        this.day = $.day;
        this.month = $.month;
        this.year = $.year;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigNewValueDateValueGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigNewValueDateValueGetArgs $;

        public Builder() {
            $ = new PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigNewValueDateValueGetArgs();
        }

        public Builder(PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigNewValueDateValueGetArgs defaults) {
            $ = new PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigNewValueDateValueGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder day(@Nullable Output<Integer> day) {
            $.day = day;
            return this;
        }

        public Builder day(Integer day) {
            return day(Output.of(day));
        }

        public Builder month(@Nullable Output<Integer> month) {
            $.month = month;
            return this;
        }

        public Builder month(Integer month) {
            return month(Output.of(month));
        }

        public Builder year(@Nullable Output<Integer> year) {
            $.year = year;
            return this;
        }

        public Builder year(Integer year) {
            return year(Output.of(year));
        }

        public PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigNewValueDateValueGetArgs build() {
            return $;
        }
    }

}
