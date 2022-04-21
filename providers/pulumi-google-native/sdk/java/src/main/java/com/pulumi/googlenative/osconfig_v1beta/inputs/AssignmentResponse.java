// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.osconfig_v1beta.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.osconfig_v1beta.inputs.AssignmentGroupLabelResponse;
import com.pulumi.googlenative.osconfig_v1beta.inputs.AssignmentOsTypeResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * An assignment represents the group or groups of VM instances that the policy applies to. If an assignment is empty, it applies to all VM instances. Otherwise, the targeted VM instances must meet all the criteria specified. So if both labels and zones are specified, the policy applies to VM instances with those labels and in those zones.
 * 
 */
public final class AssignmentResponse extends com.pulumi.resources.InvokeArgs {

    public static final AssignmentResponse Empty = new AssignmentResponse();

    /**
     * Targets instances matching at least one of these label sets. This allows an assignment to target disparate groups, for example &#34;env=prod or env=staging&#34;.
     * 
     */
    @Import(name="groupLabels", required=true)
    private List<AssignmentGroupLabelResponse> groupLabels;

    public List<AssignmentGroupLabelResponse> groupLabels() {
        return this.groupLabels;
    }

    /**
     * Targets VM instances whose name starts with one of these prefixes. Like labels, this is another way to group VM instances when targeting configs, for example prefix=&#34;prod-&#34;. Only supported for project-level policies.
     * 
     */
    @Import(name="instanceNamePrefixes", required=true)
    private List<String> instanceNamePrefixes;

    public List<String> instanceNamePrefixes() {
        return this.instanceNamePrefixes;
    }

    /**
     * Targets any of the instances specified. Instances are specified by their URI in the form `zones/[ZONE]/instances/[INSTANCE_NAME]`. Instance targeting is uncommon and is supported to facilitate the management of changes by the instance or to target specific VM instances for development and testing. Only supported for project-level policies and must reference instances within this project.
     * 
     */
    @Import(name="instances", required=true)
    private List<String> instances;

    public List<String> instances() {
        return this.instances;
    }

    /**
     * Targets VM instances matching at least one of the following OS types. VM instances must match all supplied criteria for a given OsType to be included.
     * 
     */
    @Import(name="osTypes", required=true)
    private List<AssignmentOsTypeResponse> osTypes;

    public List<AssignmentOsTypeResponse> osTypes() {
        return this.osTypes;
    }

    /**
     * Targets instances in any of these zones. Leave empty to target instances in any zone. Zonal targeting is uncommon and is supported to facilitate the management of changes by zone.
     * 
     */
    @Import(name="zones", required=true)
    private List<String> zones;

    public List<String> zones() {
        return this.zones;
    }

    private AssignmentResponse() {}

    private AssignmentResponse(AssignmentResponse $) {
        this.groupLabels = $.groupLabels;
        this.instanceNamePrefixes = $.instanceNamePrefixes;
        this.instances = $.instances;
        this.osTypes = $.osTypes;
        this.zones = $.zones;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AssignmentResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AssignmentResponse $;

        public Builder() {
            $ = new AssignmentResponse();
        }

        public Builder(AssignmentResponse defaults) {
            $ = new AssignmentResponse(Objects.requireNonNull(defaults));
        }

        public Builder groupLabels(List<AssignmentGroupLabelResponse> groupLabels) {
            $.groupLabels = groupLabels;
            return this;
        }

        public Builder groupLabels(AssignmentGroupLabelResponse... groupLabels) {
            return groupLabels(List.of(groupLabels));
        }

        public Builder instanceNamePrefixes(List<String> instanceNamePrefixes) {
            $.instanceNamePrefixes = instanceNamePrefixes;
            return this;
        }

        public Builder instanceNamePrefixes(String... instanceNamePrefixes) {
            return instanceNamePrefixes(List.of(instanceNamePrefixes));
        }

        public Builder instances(List<String> instances) {
            $.instances = instances;
            return this;
        }

        public Builder instances(String... instances) {
            return instances(List.of(instances));
        }

        public Builder osTypes(List<AssignmentOsTypeResponse> osTypes) {
            $.osTypes = osTypes;
            return this;
        }

        public Builder osTypes(AssignmentOsTypeResponse... osTypes) {
            return osTypes(List.of(osTypes));
        }

        public Builder zones(List<String> zones) {
            $.zones = zones;
            return this;
        }

        public Builder zones(String... zones) {
            return zones(List.of(zones));
        }

        public AssignmentResponse build() {
            $.groupLabels = Objects.requireNonNull($.groupLabels, "expected parameter 'groupLabels' to be non-null");
            $.instanceNamePrefixes = Objects.requireNonNull($.instanceNamePrefixes, "expected parameter 'instanceNamePrefixes' to be non-null");
            $.instances = Objects.requireNonNull($.instances, "expected parameter 'instances' to be non-null");
            $.osTypes = Objects.requireNonNull($.osTypes, "expected parameter 'osTypes' to be non-null");
            $.zones = Objects.requireNonNull($.zones, "expected parameter 'zones' to be non-null");
            return $;
        }
    }

}
