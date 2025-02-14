// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storage.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.util.Objects;

@CustomType
public final class DateAfterCreationResponse {
    /**
     * @return Value indicating the age in days after creation
     * 
     */
    private final Double daysAfterCreationGreaterThan;

    @CustomType.Constructor
    private DateAfterCreationResponse(@CustomType.Parameter("daysAfterCreationGreaterThan") Double daysAfterCreationGreaterThan) {
        this.daysAfterCreationGreaterThan = daysAfterCreationGreaterThan;
    }

    /**
     * @return Value indicating the age in days after creation
     * 
     */
    public Double daysAfterCreationGreaterThan() {
        return this.daysAfterCreationGreaterThan;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DateAfterCreationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Double daysAfterCreationGreaterThan;

        public Builder() {
    	      // Empty
        }

        public Builder(DateAfterCreationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.daysAfterCreationGreaterThan = defaults.daysAfterCreationGreaterThan;
        }

        public Builder daysAfterCreationGreaterThan(Double daysAfterCreationGreaterThan) {
            this.daysAfterCreationGreaterThan = Objects.requireNonNull(daysAfterCreationGreaterThan);
            return this;
        }        public DateAfterCreationResponse build() {
            return new DateAfterCreationResponse(daysAfterCreationGreaterThan);
        }
    }
}
