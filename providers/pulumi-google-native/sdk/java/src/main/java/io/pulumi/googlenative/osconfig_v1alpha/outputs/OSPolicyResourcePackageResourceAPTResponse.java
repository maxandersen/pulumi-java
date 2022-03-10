// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1alpha.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class OSPolicyResourcePackageResourceAPTResponse {
    /**
     * Package name.
     * 
     */
    private final String name;

    @OutputCustomType.Constructor
    private OSPolicyResourcePackageResourceAPTResponse(@OutputCustomType.Parameter("name") String name) {
        this.name = name;
    }

    /**
     * Package name.
     * 
    */
    public String getName() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OSPolicyResourcePackageResourceAPTResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(OSPolicyResourcePackageResourceAPTResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public OSPolicyResourcePackageResourceAPTResponse build() {
            return new OSPolicyResourcePackageResourceAPTResponse(name);
        }
    }
}
