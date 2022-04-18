// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.osconfig_v1alpha.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * A package managed by APT. - install: `apt-get update && apt-get -y install [name]` - remove: `apt-get -y remove [name]`
 * 
 */
public final class OSPolicyResourcePackageResourceAPTArgs extends com.pulumi.resources.ResourceArgs {

    public static final OSPolicyResourcePackageResourceAPTArgs Empty = new OSPolicyResourcePackageResourceAPTArgs();

    /**
     * Package name.
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    public OSPolicyResourcePackageResourceAPTArgs(Output<String> name) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private OSPolicyResourcePackageResourceAPTArgs() {
        this.name = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OSPolicyResourcePackageResourceAPTArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(OSPolicyResourcePackageResourceAPTArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
        }

        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }        public OSPolicyResourcePackageResourceAPTArgs build() {
            return new OSPolicyResourcePackageResourceAPTArgs(name);
        }
    }
}
