// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.osconfig_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * A package managed by Zypper. - install: `zypper -y install package` - remove: `zypper -y rm package`
 * 
 */
public final class OSPolicyResourcePackageResourceZypperArgs extends com.pulumi.resources.ResourceArgs {

    public static final OSPolicyResourcePackageResourceZypperArgs Empty = new OSPolicyResourcePackageResourceZypperArgs();

    /**
     * Package name.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    private OSPolicyResourcePackageResourceZypperArgs() {}

    private OSPolicyResourcePackageResourceZypperArgs(OSPolicyResourcePackageResourceZypperArgs $) {
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OSPolicyResourcePackageResourceZypperArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OSPolicyResourcePackageResourceZypperArgs $;

        public Builder() {
            $ = new OSPolicyResourcePackageResourceZypperArgs();
        }

        public Builder(OSPolicyResourcePackageResourceZypperArgs defaults) {
            $ = new OSPolicyResourcePackageResourceZypperArgs(Objects.requireNonNull(defaults));
        }

        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public OSPolicyResourcePackageResourceZypperArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
