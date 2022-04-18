// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.wafv2.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


public final class WebACLImmunityTimeProperty extends com.pulumi.resources.InvokeArgs {

    public static final WebACLImmunityTimeProperty Empty = new WebACLImmunityTimeProperty();

    @Import(name="immunityTime", required=true)
      private final Integer immunityTime;

    public Integer immunityTime() {
        return this.immunityTime;
    }

    public WebACLImmunityTimeProperty(Integer immunityTime) {
        this.immunityTime = Objects.requireNonNull(immunityTime, "expected parameter 'immunityTime' to be non-null");
    }

    private WebACLImmunityTimeProperty() {
        this.immunityTime = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebACLImmunityTimeProperty defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer immunityTime;

        public Builder() {
    	      // Empty
        }

        public Builder(WebACLImmunityTimeProperty defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.immunityTime = defaults.immunityTime;
        }

        public Builder immunityTime(Integer immunityTime) {
            this.immunityTime = Objects.requireNonNull(immunityTime);
            return this;
        }        public WebACLImmunityTimeProperty build() {
            return new WebACLImmunityTimeProperty(immunityTime);
        }
    }
}
