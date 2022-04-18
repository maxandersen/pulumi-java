// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.licensemanager.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class LicenseValidityDateFormat extends com.pulumi.resources.InvokeArgs {

    public static final LicenseValidityDateFormat Empty = new LicenseValidityDateFormat();

    /**
     * Validity begin date for the license.
     * 
     */
    @Import(name="begin", required=true)
      private final String begin;

    public String begin() {
        return this.begin;
    }

    /**
     * Validity begin date for the license.
     * 
     */
    @Import(name="end", required=true)
      private final String end;

    public String end() {
        return this.end;
    }

    public LicenseValidityDateFormat(
        String begin,
        String end) {
        this.begin = Objects.requireNonNull(begin, "expected parameter 'begin' to be non-null");
        this.end = Objects.requireNonNull(end, "expected parameter 'end' to be non-null");
    }

    private LicenseValidityDateFormat() {
        this.begin = null;
        this.end = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LicenseValidityDateFormat defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String begin;
        private String end;

        public Builder() {
    	      // Empty
        }

        public Builder(LicenseValidityDateFormat defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.begin = defaults.begin;
    	      this.end = defaults.end;
        }

        public Builder begin(String begin) {
            this.begin = Objects.requireNonNull(begin);
            return this;
        }
        public Builder end(String end) {
            this.end = Objects.requireNonNull(end);
            return this;
        }        public LicenseValidityDateFormat build() {
            return new LicenseValidityDateFormat(begin, end);
        }
    }
}
