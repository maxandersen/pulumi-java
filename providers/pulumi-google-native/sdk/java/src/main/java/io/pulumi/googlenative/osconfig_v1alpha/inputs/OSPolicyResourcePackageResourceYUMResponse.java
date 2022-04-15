// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1alpha.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * A package managed by YUM. - install: `yum -y install package` - remove: `yum -y remove package`
 * 
 */
public final class OSPolicyResourcePackageResourceYUMResponse extends io.pulumi.resources.InvokeArgs {

    public static final OSPolicyResourcePackageResourceYUMResponse Empty = new OSPolicyResourcePackageResourceYUMResponse();

    /**
     * Package name.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String name() {
        return this.name;
    }

    public OSPolicyResourcePackageResourceYUMResponse(String name) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private OSPolicyResourcePackageResourceYUMResponse() {
        this.name = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OSPolicyResourcePackageResourceYUMResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(OSPolicyResourcePackageResourceYUMResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }        public OSPolicyResourcePackageResourceYUMResponse build() {
            return new OSPolicyResourcePackageResourceYUMResponse(name);
        }
    }
}
