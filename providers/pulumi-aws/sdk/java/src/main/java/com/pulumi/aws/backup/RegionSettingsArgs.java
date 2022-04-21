// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.backup;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RegionSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final RegionSettingsArgs Empty = new RegionSettingsArgs();

    /**
     * A map of services along with the management preferences for the Region.
     * 
     */
    @Import(name="resourceTypeManagementPreference")
    private @Nullable Output<Map<String,Boolean>> resourceTypeManagementPreference;

    public Optional<Output<Map<String,Boolean>>> resourceTypeManagementPreference() {
        return Optional.ofNullable(this.resourceTypeManagementPreference);
    }

    /**
     * A map of services along with the opt-in preferences for the Region.
     * 
     */
    @Import(name="resourceTypeOptInPreference", required=true)
    private Output<Map<String,Boolean>> resourceTypeOptInPreference;

    public Output<Map<String,Boolean>> resourceTypeOptInPreference() {
        return this.resourceTypeOptInPreference;
    }

    private RegionSettingsArgs() {}

    private RegionSettingsArgs(RegionSettingsArgs $) {
        this.resourceTypeManagementPreference = $.resourceTypeManagementPreference;
        this.resourceTypeOptInPreference = $.resourceTypeOptInPreference;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RegionSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RegionSettingsArgs $;

        public Builder() {
            $ = new RegionSettingsArgs();
        }

        public Builder(RegionSettingsArgs defaults) {
            $ = new RegionSettingsArgs(Objects.requireNonNull(defaults));
        }

        public Builder resourceTypeManagementPreference(@Nullable Output<Map<String,Boolean>> resourceTypeManagementPreference) {
            $.resourceTypeManagementPreference = resourceTypeManagementPreference;
            return this;
        }

        public Builder resourceTypeManagementPreference(Map<String,Boolean> resourceTypeManagementPreference) {
            return resourceTypeManagementPreference(Output.of(resourceTypeManagementPreference));
        }

        public Builder resourceTypeOptInPreference(Output<Map<String,Boolean>> resourceTypeOptInPreference) {
            $.resourceTypeOptInPreference = resourceTypeOptInPreference;
            return this;
        }

        public Builder resourceTypeOptInPreference(Map<String,Boolean> resourceTypeOptInPreference) {
            return resourceTypeOptInPreference(Output.of(resourceTypeOptInPreference));
        }

        public RegionSettingsArgs build() {
            $.resourceTypeOptInPreference = Objects.requireNonNull($.resourceTypeOptInPreference, "expected parameter 'resourceTypeOptInPreference' to be non-null");
            return $;
        }
    }

}
