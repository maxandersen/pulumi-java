// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.osconfig_v1.outputs.OSPolicyAssignmentInstanceFilterResponse;
import io.pulumi.googlenative.osconfig_v1.outputs.OSPolicyAssignmentRolloutResponse;
import io.pulumi.googlenative.osconfig_v1.outputs.OSPolicyResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetOsPolicyAssignmentResult {
    /**
     * Indicates that this revision has been successfully rolled out in this zone and new VMs will be assigned OS policies from this revision. For a given OS policy assignment, there is only one revision with a value of `true` for this field.
     * 
     */
    private final Boolean baseline;
    /**
     * Indicates that this revision deletes the OS policy assignment.
     * 
     */
    private final Boolean deleted;
    /**
     * OS policy assignment description. Length of the description is limited to 1024 characters.
     * 
     */
    private final String description;
    /**
     * The etag for this OS policy assignment. If this is provided on update, it must match the server's etag.
     * 
     */
    private final String etag;
    /**
     * Filter to select VMs.
     * 
     */
    private final OSPolicyAssignmentInstanceFilterResponse instanceFilter;
    /**
     * Resource name. Format: `projects/{project_number}/locations/{location}/osPolicyAssignments/{os_policy_assignment_id}` This field is ignored when you create an OS policy assignment.
     * 
     */
    private final String name;
    /**
     * List of OS policies to be applied to the VMs.
     * 
     */
    private final List<OSPolicyResponse> osPolicies;
    /**
     * Indicates that reconciliation is in progress for the revision. This value is `true` when the `rollout_state` is one of: * IN_PROGRESS * CANCELLING
     * 
     */
    private final Boolean reconciling;
    /**
     * The timestamp that the revision was created.
     * 
     */
    private final String revisionCreateTime;
    /**
     * The assignment revision ID A new revision is committed whenever a rollout is triggered for a OS policy assignment
     * 
     */
    private final String revisionId;
    /**
     * Rollout to deploy the OS policy assignment. A rollout is triggered in the following situations: 1) OSPolicyAssignment is created. 2) OSPolicyAssignment is updated and the update contains changes to one of the following fields: - instance_filter - os_policies 3) OSPolicyAssignment is deleted.
     * 
     */
    private final OSPolicyAssignmentRolloutResponse rollout;
    /**
     * OS policy assignment rollout state
     * 
     */
    private final String rolloutState;
    /**
     * Server generated unique id for the OS policy assignment resource.
     * 
     */
    private final String uid;

    @OutputCustomType.Constructor
    private GetOsPolicyAssignmentResult(
        @OutputCustomType.Parameter("baseline") Boolean baseline,
        @OutputCustomType.Parameter("deleted") Boolean deleted,
        @OutputCustomType.Parameter("description") String description,
        @OutputCustomType.Parameter("etag") String etag,
        @OutputCustomType.Parameter("instanceFilter") OSPolicyAssignmentInstanceFilterResponse instanceFilter,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("osPolicies") List<OSPolicyResponse> osPolicies,
        @OutputCustomType.Parameter("reconciling") Boolean reconciling,
        @OutputCustomType.Parameter("revisionCreateTime") String revisionCreateTime,
        @OutputCustomType.Parameter("revisionId") String revisionId,
        @OutputCustomType.Parameter("rollout") OSPolicyAssignmentRolloutResponse rollout,
        @OutputCustomType.Parameter("rolloutState") String rolloutState,
        @OutputCustomType.Parameter("uid") String uid) {
        this.baseline = baseline;
        this.deleted = deleted;
        this.description = description;
        this.etag = etag;
        this.instanceFilter = instanceFilter;
        this.name = name;
        this.osPolicies = osPolicies;
        this.reconciling = reconciling;
        this.revisionCreateTime = revisionCreateTime;
        this.revisionId = revisionId;
        this.rollout = rollout;
        this.rolloutState = rolloutState;
        this.uid = uid;
    }

    /**
     * Indicates that this revision has been successfully rolled out in this zone and new VMs will be assigned OS policies from this revision. For a given OS policy assignment, there is only one revision with a value of `true` for this field.
     * 
    */
    public Boolean getBaseline() {
        return this.baseline;
    }
    /**
     * Indicates that this revision deletes the OS policy assignment.
     * 
    */
    public Boolean getDeleted() {
        return this.deleted;
    }
    /**
     * OS policy assignment description. Length of the description is limited to 1024 characters.
     * 
    */
    public String getDescription() {
        return this.description;
    }
    /**
     * The etag for this OS policy assignment. If this is provided on update, it must match the server's etag.
     * 
    */
    public String getEtag() {
        return this.etag;
    }
    /**
     * Filter to select VMs.
     * 
    */
    public OSPolicyAssignmentInstanceFilterResponse getInstanceFilter() {
        return this.instanceFilter;
    }
    /**
     * Resource name. Format: `projects/{project_number}/locations/{location}/osPolicyAssignments/{os_policy_assignment_id}` This field is ignored when you create an OS policy assignment.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * List of OS policies to be applied to the VMs.
     * 
    */
    public List<OSPolicyResponse> getOsPolicies() {
        return this.osPolicies;
    }
    /**
     * Indicates that reconciliation is in progress for the revision. This value is `true` when the `rollout_state` is one of: * IN_PROGRESS * CANCELLING
     * 
    */
    public Boolean getReconciling() {
        return this.reconciling;
    }
    /**
     * The timestamp that the revision was created.
     * 
    */
    public String getRevisionCreateTime() {
        return this.revisionCreateTime;
    }
    /**
     * The assignment revision ID A new revision is committed whenever a rollout is triggered for a OS policy assignment
     * 
    */
    public String getRevisionId() {
        return this.revisionId;
    }
    /**
     * Rollout to deploy the OS policy assignment. A rollout is triggered in the following situations: 1) OSPolicyAssignment is created. 2) OSPolicyAssignment is updated and the update contains changes to one of the following fields: - instance_filter - os_policies 3) OSPolicyAssignment is deleted.
     * 
    */
    public OSPolicyAssignmentRolloutResponse getRollout() {
        return this.rollout;
    }
    /**
     * OS policy assignment rollout state
     * 
    */
    public String getRolloutState() {
        return this.rolloutState;
    }
    /**
     * Server generated unique id for the OS policy assignment resource.
     * 
    */
    public String getUid() {
        return this.uid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOsPolicyAssignmentResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean baseline;
        private Boolean deleted;
        private String description;
        private String etag;
        private OSPolicyAssignmentInstanceFilterResponse instanceFilter;
        private String name;
        private List<OSPolicyResponse> osPolicies;
        private Boolean reconciling;
        private String revisionCreateTime;
        private String revisionId;
        private OSPolicyAssignmentRolloutResponse rollout;
        private String rolloutState;
        private String uid;

        public Builder() {
    	      // Empty
        }

        public Builder(GetOsPolicyAssignmentResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.baseline = defaults.baseline;
    	      this.deleted = defaults.deleted;
    	      this.description = defaults.description;
    	      this.etag = defaults.etag;
    	      this.instanceFilter = defaults.instanceFilter;
    	      this.name = defaults.name;
    	      this.osPolicies = defaults.osPolicies;
    	      this.reconciling = defaults.reconciling;
    	      this.revisionCreateTime = defaults.revisionCreateTime;
    	      this.revisionId = defaults.revisionId;
    	      this.rollout = defaults.rollout;
    	      this.rolloutState = defaults.rolloutState;
    	      this.uid = defaults.uid;
        }

        public Builder setBaseline(Boolean baseline) {
            this.baseline = Objects.requireNonNull(baseline);
            return this;
        }

        public Builder setDeleted(Boolean deleted) {
            this.deleted = Objects.requireNonNull(deleted);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setInstanceFilter(OSPolicyAssignmentInstanceFilterResponse instanceFilter) {
            this.instanceFilter = Objects.requireNonNull(instanceFilter);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setOsPolicies(List<OSPolicyResponse> osPolicies) {
            this.osPolicies = Objects.requireNonNull(osPolicies);
            return this;
        }

        public Builder setReconciling(Boolean reconciling) {
            this.reconciling = Objects.requireNonNull(reconciling);
            return this;
        }

        public Builder setRevisionCreateTime(String revisionCreateTime) {
            this.revisionCreateTime = Objects.requireNonNull(revisionCreateTime);
            return this;
        }

        public Builder setRevisionId(String revisionId) {
            this.revisionId = Objects.requireNonNull(revisionId);
            return this;
        }

        public Builder setRollout(OSPolicyAssignmentRolloutResponse rollout) {
            this.rollout = Objects.requireNonNull(rollout);
            return this;
        }

        public Builder setRolloutState(String rolloutState) {
            this.rolloutState = Objects.requireNonNull(rolloutState);
            return this;
        }

        public Builder setUid(String uid) {
            this.uid = Objects.requireNonNull(uid);
            return this;
        }
        public GetOsPolicyAssignmentResult build() {
            return new GetOsPolicyAssignmentResult(baseline, deleted, description, etag, instanceFilter, name, osPolicies, reconciling, revisionCreateTime, revisionId, rollout, rolloutState, uid);
        }
    }
}
