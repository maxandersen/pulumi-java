// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storage.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Object to define the number of days after object last modification Or last access. Properties daysAfterModificationGreaterThan and daysAfterLastAccessTimeGreaterThan are mutually exclusive.
 * 
 */
public final class DateAfterModificationResponse extends com.pulumi.resources.InvokeArgs {

    public static final DateAfterModificationResponse Empty = new DateAfterModificationResponse();

    /**
     * Value indicating the age in days after last blob access. This property can only be used in conjunction with last access time tracking policy
     * 
     */
    @Import(name="daysAfterLastAccessTimeGreaterThan")
    private @Nullable Double daysAfterLastAccessTimeGreaterThan;

    public Optional<Double> daysAfterLastAccessTimeGreaterThan() {
        return Optional.ofNullable(this.daysAfterLastAccessTimeGreaterThan);
    }

    /**
     * Value indicating the age in days after last modification
     * 
     */
    @Import(name="daysAfterModificationGreaterThan")
    private @Nullable Double daysAfterModificationGreaterThan;

    public Optional<Double> daysAfterModificationGreaterThan() {
        return Optional.ofNullable(this.daysAfterModificationGreaterThan);
    }

    private DateAfterModificationResponse() {}

    private DateAfterModificationResponse(DateAfterModificationResponse $) {
        this.daysAfterLastAccessTimeGreaterThan = $.daysAfterLastAccessTimeGreaterThan;
        this.daysAfterModificationGreaterThan = $.daysAfterModificationGreaterThan;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DateAfterModificationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DateAfterModificationResponse $;

        public Builder() {
            $ = new DateAfterModificationResponse();
        }

        public Builder(DateAfterModificationResponse defaults) {
            $ = new DateAfterModificationResponse(Objects.requireNonNull(defaults));
        }

        public Builder daysAfterLastAccessTimeGreaterThan(@Nullable Double daysAfterLastAccessTimeGreaterThan) {
            $.daysAfterLastAccessTimeGreaterThan = daysAfterLastAccessTimeGreaterThan;
            return this;
        }

        public Builder daysAfterModificationGreaterThan(@Nullable Double daysAfterModificationGreaterThan) {
            $.daysAfterModificationGreaterThan = daysAfterModificationGreaterThan;
            return this;
        }

        public DateAfterModificationResponse build() {
            return $;
        }
    }

}
