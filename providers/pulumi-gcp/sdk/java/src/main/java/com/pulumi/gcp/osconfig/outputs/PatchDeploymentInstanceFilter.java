// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.osconfig.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.osconfig.outputs.PatchDeploymentInstanceFilterGroupLabel;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PatchDeploymentInstanceFilter {
    /**
     * Target all VM instances in the project. If true, no other criteria is permitted.
     * 
     */
    private final @Nullable Boolean all;
    /**
     * Targets VM instances matching ANY of these GroupLabels. This allows targeting of disparate groups of VM instances.
     * Structure is documented below.
     * 
     */
    private final @Nullable List<PatchDeploymentInstanceFilterGroupLabel> groupLabels;
    /**
     * Targets VMs whose name starts with one of these prefixes. Similar to labels, this is another way to group
     * VMs when targeting configs, for example prefix=&#34;prod-&#34;.
     * 
     */
    private final @Nullable List<String> instanceNamePrefixes;
    /**
     * Targets any of the VM instances specified. Instances are specified by their URI in the `form zones/{{zone}}/instances/{{instance_name}}`,
     * `projects/{{project_id}}/zones/{{zone}}/instances/{{instance_name}}`, or
     * `https://www.googleapis.com/compute/v1/projects/{{project_id}}/zones/{{zone}}/instances/{{instance_name}}`
     * 
     */
    private final @Nullable List<String> instances;
    /**
     * Targets VM instances in ANY of these zones. Leave empty to target VM instances in any zone.
     * 
     */
    private final @Nullable List<String> zones;

    @CustomType.Constructor
    private PatchDeploymentInstanceFilter(
        @CustomType.Parameter("all") @Nullable Boolean all,
        @CustomType.Parameter("groupLabels") @Nullable List<PatchDeploymentInstanceFilterGroupLabel> groupLabels,
        @CustomType.Parameter("instanceNamePrefixes") @Nullable List<String> instanceNamePrefixes,
        @CustomType.Parameter("instances") @Nullable List<String> instances,
        @CustomType.Parameter("zones") @Nullable List<String> zones) {
        this.all = all;
        this.groupLabels = groupLabels;
        this.instanceNamePrefixes = instanceNamePrefixes;
        this.instances = instances;
        this.zones = zones;
    }

    /**
     * Target all VM instances in the project. If true, no other criteria is permitted.
     * 
    */
    public Optional<Boolean> all() {
        return Optional.ofNullable(this.all);
    }
    /**
     * Targets VM instances matching ANY of these GroupLabels. This allows targeting of disparate groups of VM instances.
     * Structure is documented below.
     * 
    */
    public List<PatchDeploymentInstanceFilterGroupLabel> groupLabels() {
        return this.groupLabels == null ? List.of() : this.groupLabels;
    }
    /**
     * Targets VMs whose name starts with one of these prefixes. Similar to labels, this is another way to group
     * VMs when targeting configs, for example prefix=&#34;prod-&#34;.
     * 
    */
    public List<String> instanceNamePrefixes() {
        return this.instanceNamePrefixes == null ? List.of() : this.instanceNamePrefixes;
    }
    /**
     * Targets any of the VM instances specified. Instances are specified by their URI in the `form zones/{{zone}}/instances/{{instance_name}}`,
     * `projects/{{project_id}}/zones/{{zone}}/instances/{{instance_name}}`, or
     * `https://www.googleapis.com/compute/v1/projects/{{project_id}}/zones/{{zone}}/instances/{{instance_name}}`
     * 
    */
    public List<String> instances() {
        return this.instances == null ? List.of() : this.instances;
    }
    /**
     * Targets VM instances in ANY of these zones. Leave empty to target VM instances in any zone.
     * 
    */
    public List<String> zones() {
        return this.zones == null ? List.of() : this.zones;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PatchDeploymentInstanceFilter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean all;
        private @Nullable List<PatchDeploymentInstanceFilterGroupLabel> groupLabels;
        private @Nullable List<String> instanceNamePrefixes;
        private @Nullable List<String> instances;
        private @Nullable List<String> zones;

        public Builder() {
    	      // Empty
        }

        public Builder(PatchDeploymentInstanceFilter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.all = defaults.all;
    	      this.groupLabels = defaults.groupLabels;
    	      this.instanceNamePrefixes = defaults.instanceNamePrefixes;
    	      this.instances = defaults.instances;
    	      this.zones = defaults.zones;
        }

        public Builder all(@Nullable Boolean all) {
            this.all = all;
            return this;
        }
        public Builder groupLabels(@Nullable List<PatchDeploymentInstanceFilterGroupLabel> groupLabels) {
            this.groupLabels = groupLabels;
            return this;
        }
        public Builder groupLabels(PatchDeploymentInstanceFilterGroupLabel... groupLabels) {
            return groupLabels(List.of(groupLabels));
        }
        public Builder instanceNamePrefixes(@Nullable List<String> instanceNamePrefixes) {
            this.instanceNamePrefixes = instanceNamePrefixes;
            return this;
        }
        public Builder instanceNamePrefixes(String... instanceNamePrefixes) {
            return instanceNamePrefixes(List.of(instanceNamePrefixes));
        }
        public Builder instances(@Nullable List<String> instances) {
            this.instances = instances;
            return this;
        }
        public Builder instances(String... instances) {
            return instances(List.of(instances));
        }
        public Builder zones(@Nullable List<String> zones) {
            this.zones = zones;
            return this;
        }
        public Builder zones(String... zones) {
            return zones(List.of(zones));
        }        public PatchDeploymentInstanceFilter build() {
            return new PatchDeploymentInstanceFilter(all, groupLabels, instanceNamePrefixes, instances, zones);
        }
    }
}
