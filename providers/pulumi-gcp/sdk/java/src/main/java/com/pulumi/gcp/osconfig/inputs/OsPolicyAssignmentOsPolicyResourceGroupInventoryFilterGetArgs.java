// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.osconfig.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OsPolicyAssignmentOsPolicyResourceGroupInventoryFilterGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final OsPolicyAssignmentOsPolicyResourceGroupInventoryFilterGetArgs Empty = new OsPolicyAssignmentOsPolicyResourceGroupInventoryFilterGetArgs();

    /**
     * Required. The OS short name
     * 
     */
    @Import(name="osShortName", required=true)
    private Output<String> osShortName;

    public Output<String> osShortName() {
        return this.osShortName;
    }

    /**
     * The OS version Prefix matches are supported if asterisk(*) is provided as the last character. For example, to match all versions with a major version of `7`, specify the following value for this field `7.*` An empty string matches all OS versions.
     * 
     */
    @Import(name="osVersion")
    private @Nullable Output<String> osVersion;

    public Optional<Output<String>> osVersion() {
        return Optional.ofNullable(this.osVersion);
    }

    private OsPolicyAssignmentOsPolicyResourceGroupInventoryFilterGetArgs() {}

    private OsPolicyAssignmentOsPolicyResourceGroupInventoryFilterGetArgs(OsPolicyAssignmentOsPolicyResourceGroupInventoryFilterGetArgs $) {
        this.osShortName = $.osShortName;
        this.osVersion = $.osVersion;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OsPolicyAssignmentOsPolicyResourceGroupInventoryFilterGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OsPolicyAssignmentOsPolicyResourceGroupInventoryFilterGetArgs $;

        public Builder() {
            $ = new OsPolicyAssignmentOsPolicyResourceGroupInventoryFilterGetArgs();
        }

        public Builder(OsPolicyAssignmentOsPolicyResourceGroupInventoryFilterGetArgs defaults) {
            $ = new OsPolicyAssignmentOsPolicyResourceGroupInventoryFilterGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder osShortName(Output<String> osShortName) {
            $.osShortName = osShortName;
            return this;
        }

        public Builder osShortName(String osShortName) {
            return osShortName(Output.of(osShortName));
        }

        public Builder osVersion(@Nullable Output<String> osVersion) {
            $.osVersion = osVersion;
            return this;
        }

        public Builder osVersion(String osVersion) {
            return osVersion(Output.of(osVersion));
        }

        public OsPolicyAssignmentOsPolicyResourceGroupInventoryFilterGetArgs build() {
            $.osShortName = Objects.requireNonNull($.osShortName, "expected parameter 'osShortName' to be non-null");
            return $;
        }
    }

}
