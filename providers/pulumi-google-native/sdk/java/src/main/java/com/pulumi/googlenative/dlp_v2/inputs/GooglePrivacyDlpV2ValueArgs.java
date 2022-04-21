// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dlp_v2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dlp_v2.enums.GooglePrivacyDlpV2ValueDayOfWeekValue;
import com.pulumi.googlenative.dlp_v2.inputs.GoogleTypeDateArgs;
import com.pulumi.googlenative.dlp_v2.inputs.GoogleTypeTimeOfDayArgs;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Set of primitive values supported by the system. Note that for the purposes of inspection or transformation, the number of bytes considered to comprise a &#39;Value&#39; is based on its representation as a UTF-8 encoded string. For example, if &#39;integer_value&#39; is set to 123456789, the number of bytes would be counted as 9, even though an int64 only holds up to 8 bytes of data.
 * 
 */
public final class GooglePrivacyDlpV2ValueArgs extends com.pulumi.resources.ResourceArgs {

    public static final GooglePrivacyDlpV2ValueArgs Empty = new GooglePrivacyDlpV2ValueArgs();

    /**
     * boolean
     * 
     */
    @Import(name="booleanValue")
    private @Nullable Output<Boolean> booleanValue;

    public Optional<Output<Boolean>> booleanValue() {
        return Optional.ofNullable(this.booleanValue);
    }

    /**
     * date
     * 
     */
    @Import(name="dateValue")
    private @Nullable Output<GoogleTypeDateArgs> dateValue;

    public Optional<Output<GoogleTypeDateArgs>> dateValue() {
        return Optional.ofNullable(this.dateValue);
    }

    /**
     * day of week
     * 
     */
    @Import(name="dayOfWeekValue")
    private @Nullable Output<GooglePrivacyDlpV2ValueDayOfWeekValue> dayOfWeekValue;

    public Optional<Output<GooglePrivacyDlpV2ValueDayOfWeekValue>> dayOfWeekValue() {
        return Optional.ofNullable(this.dayOfWeekValue);
    }

    /**
     * float
     * 
     */
    @Import(name="floatValue")
    private @Nullable Output<Double> floatValue;

    public Optional<Output<Double>> floatValue() {
        return Optional.ofNullable(this.floatValue);
    }

    /**
     * integer
     * 
     */
    @Import(name="integerValue")
    private @Nullable Output<String> integerValue;

    public Optional<Output<String>> integerValue() {
        return Optional.ofNullable(this.integerValue);
    }

    /**
     * string
     * 
     */
    @Import(name="stringValue")
    private @Nullable Output<String> stringValue;

    public Optional<Output<String>> stringValue() {
        return Optional.ofNullable(this.stringValue);
    }

    /**
     * time of day
     * 
     */
    @Import(name="timeValue")
    private @Nullable Output<GoogleTypeTimeOfDayArgs> timeValue;

    public Optional<Output<GoogleTypeTimeOfDayArgs>> timeValue() {
        return Optional.ofNullable(this.timeValue);
    }

    /**
     * timestamp
     * 
     */
    @Import(name="timestampValue")
    private @Nullable Output<String> timestampValue;

    public Optional<Output<String>> timestampValue() {
        return Optional.ofNullable(this.timestampValue);
    }

    private GooglePrivacyDlpV2ValueArgs() {}

    private GooglePrivacyDlpV2ValueArgs(GooglePrivacyDlpV2ValueArgs $) {
        this.booleanValue = $.booleanValue;
        this.dateValue = $.dateValue;
        this.dayOfWeekValue = $.dayOfWeekValue;
        this.floatValue = $.floatValue;
        this.integerValue = $.integerValue;
        this.stringValue = $.stringValue;
        this.timeValue = $.timeValue;
        this.timestampValue = $.timestampValue;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GooglePrivacyDlpV2ValueArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GooglePrivacyDlpV2ValueArgs $;

        public Builder() {
            $ = new GooglePrivacyDlpV2ValueArgs();
        }

        public Builder(GooglePrivacyDlpV2ValueArgs defaults) {
            $ = new GooglePrivacyDlpV2ValueArgs(Objects.requireNonNull(defaults));
        }

        public Builder booleanValue(@Nullable Output<Boolean> booleanValue) {
            $.booleanValue = booleanValue;
            return this;
        }

        public Builder booleanValue(Boolean booleanValue) {
            return booleanValue(Output.of(booleanValue));
        }

        public Builder dateValue(@Nullable Output<GoogleTypeDateArgs> dateValue) {
            $.dateValue = dateValue;
            return this;
        }

        public Builder dateValue(GoogleTypeDateArgs dateValue) {
            return dateValue(Output.of(dateValue));
        }

        public Builder dayOfWeekValue(@Nullable Output<GooglePrivacyDlpV2ValueDayOfWeekValue> dayOfWeekValue) {
            $.dayOfWeekValue = dayOfWeekValue;
            return this;
        }

        public Builder dayOfWeekValue(GooglePrivacyDlpV2ValueDayOfWeekValue dayOfWeekValue) {
            return dayOfWeekValue(Output.of(dayOfWeekValue));
        }

        public Builder floatValue(@Nullable Output<Double> floatValue) {
            $.floatValue = floatValue;
            return this;
        }

        public Builder floatValue(Double floatValue) {
            return floatValue(Output.of(floatValue));
        }

        public Builder integerValue(@Nullable Output<String> integerValue) {
            $.integerValue = integerValue;
            return this;
        }

        public Builder integerValue(String integerValue) {
            return integerValue(Output.of(integerValue));
        }

        public Builder stringValue(@Nullable Output<String> stringValue) {
            $.stringValue = stringValue;
            return this;
        }

        public Builder stringValue(String stringValue) {
            return stringValue(Output.of(stringValue));
        }

        public Builder timeValue(@Nullable Output<GoogleTypeTimeOfDayArgs> timeValue) {
            $.timeValue = timeValue;
            return this;
        }

        public Builder timeValue(GoogleTypeTimeOfDayArgs timeValue) {
            return timeValue(Output.of(timeValue));
        }

        public Builder timestampValue(@Nullable Output<String> timestampValue) {
            $.timestampValue = timestampValue;
            return this;
        }

        public Builder timestampValue(String timestampValue) {
            return timestampValue(Output.of(timestampValue));
        }

        public GooglePrivacyDlpV2ValueArgs build() {
            return $;
        }
    }

}
