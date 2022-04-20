// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.vmmigration_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.vmmigration_v1.outputs.CloneJobResponse;
import com.pulumi.googlenative.vmmigration_v1.outputs.ComputeEngineTargetDefaultsResponse;
import com.pulumi.googlenative.vmmigration_v1.outputs.CutoverJobResponse;
import com.pulumi.googlenative.vmmigration_v1.outputs.ReplicationCycleResponse;
import com.pulumi.googlenative.vmmigration_v1.outputs.ReplicationSyncResponse;
import com.pulumi.googlenative.vmmigration_v1.outputs.SchedulePolicyResponse;
import com.pulumi.googlenative.vmmigration_v1.outputs.StatusResponse;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetMigratingVmResult {
    /**
     * Details of the target VM in Compute Engine.
     * 
     */
    private final ComputeEngineTargetDefaultsResponse computeEngineTargetDefaults;
    /**
     * The time the migrating VM was created (this refers to this resource and not to the time it was installed in the source).
     * 
     */
    private final String createTime;
    /**
     * The percentage progress of the current running replication cycle.
     * 
     */
    private final ReplicationCycleResponse currentSyncInfo;
    /**
     * The description attached to the migrating VM by the user.
     * 
     */
    private final String description;
    /**
     * The display name attached to the MigratingVm by the user.
     * 
     */
    private final String displayName;
    /**
     * Provides details on the state of the Migrating VM in case of an error in replication.
     * 
     */
    private final StatusResponse error;
    /**
     * The group this migrating vm is included in, if any. The group is represented by the full path of the appropriate Group resource.
     * 
     */
    private final String group;
    /**
     * The labels of the migrating VM.
     * 
     */
    private final Map<String,String> labels;
    /**
     * The most updated snapshot created time in the source that finished replication.
     * 
     */
    private final ReplicationSyncResponse lastSync;
    /**
     * The identifier of the MigratingVm.
     * 
     */
    private final String name;
    /**
     * The replication schedule policy.
     * 
     */
    private final SchedulePolicyResponse policy;
    /**
     * The recent clone jobs performed on the migrating VM. This field holds the vm&#39;s last completed clone job and the vm&#39;s running clone job, if one exists. Note: To have this field populated you need to explicitly request it via the &#34;view&#34; parameter of the Get/List request.
     * 
     */
    private final List<CloneJobResponse> recentCloneJobs;
    /**
     * The recent cutover jobs performed on the migrating VM. This field holds the vm&#39;s last completed cutover job and the vm&#39;s running cutover job, if one exists. Note: To have this field populated you need to explicitly request it via the &#34;view&#34; parameter of the Get/List request.
     * 
     */
    private final List<CutoverJobResponse> recentCutoverJobs;
    /**
     * The unique ID of the VM in the source. The VM&#39;s name in vSphere can be changed, so this is not the VM&#39;s name but rather its moRef id. This id is of the form vm-.
     * 
     */
    private final String sourceVmId;
    /**
     * State of the MigratingVm.
     * 
     */
    private final String state;
    /**
     * The last time the migrating VM state was updated.
     * 
     */
    private final String stateTime;
    /**
     * The last time the migrating VM resource was updated.
     * 
     */
    private final String updateTime;

    @CustomType.Constructor
    private GetMigratingVmResult(
        @CustomType.Parameter("computeEngineTargetDefaults") ComputeEngineTargetDefaultsResponse computeEngineTargetDefaults,
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("currentSyncInfo") ReplicationCycleResponse currentSyncInfo,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("error") StatusResponse error,
        @CustomType.Parameter("group") String group,
        @CustomType.Parameter("labels") Map<String,String> labels,
        @CustomType.Parameter("lastSync") ReplicationSyncResponse lastSync,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("policy") SchedulePolicyResponse policy,
        @CustomType.Parameter("recentCloneJobs") List<CloneJobResponse> recentCloneJobs,
        @CustomType.Parameter("recentCutoverJobs") List<CutoverJobResponse> recentCutoverJobs,
        @CustomType.Parameter("sourceVmId") String sourceVmId,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("stateTime") String stateTime,
        @CustomType.Parameter("updateTime") String updateTime) {
        this.computeEngineTargetDefaults = computeEngineTargetDefaults;
        this.createTime = createTime;
        this.currentSyncInfo = currentSyncInfo;
        this.description = description;
        this.displayName = displayName;
        this.error = error;
        this.group = group;
        this.labels = labels;
        this.lastSync = lastSync;
        this.name = name;
        this.policy = policy;
        this.recentCloneJobs = recentCloneJobs;
        this.recentCutoverJobs = recentCutoverJobs;
        this.sourceVmId = sourceVmId;
        this.state = state;
        this.stateTime = stateTime;
        this.updateTime = updateTime;
    }

    /**
     * Details of the target VM in Compute Engine.
     * 
    */
    public ComputeEngineTargetDefaultsResponse computeEngineTargetDefaults() {
        return this.computeEngineTargetDefaults;
    }
    /**
     * The time the migrating VM was created (this refers to this resource and not to the time it was installed in the source).
     * 
    */
    public String createTime() {
        return this.createTime;
    }
    /**
     * The percentage progress of the current running replication cycle.
     * 
    */
    public ReplicationCycleResponse currentSyncInfo() {
        return this.currentSyncInfo;
    }
    /**
     * The description attached to the migrating VM by the user.
     * 
    */
    public String description() {
        return this.description;
    }
    /**
     * The display name attached to the MigratingVm by the user.
     * 
    */
    public String displayName() {
        return this.displayName;
    }
    /**
     * Provides details on the state of the Migrating VM in case of an error in replication.
     * 
    */
    public StatusResponse error() {
        return this.error;
    }
    /**
     * The group this migrating vm is included in, if any. The group is represented by the full path of the appropriate Group resource.
     * 
    */
    public String group() {
        return this.group;
    }
    /**
     * The labels of the migrating VM.
     * 
    */
    public Map<String,String> labels() {
        return this.labels;
    }
    /**
     * The most updated snapshot created time in the source that finished replication.
     * 
    */
    public ReplicationSyncResponse lastSync() {
        return this.lastSync;
    }
    /**
     * The identifier of the MigratingVm.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * The replication schedule policy.
     * 
    */
    public SchedulePolicyResponse policy() {
        return this.policy;
    }
    /**
     * The recent clone jobs performed on the migrating VM. This field holds the vm&#39;s last completed clone job and the vm&#39;s running clone job, if one exists. Note: To have this field populated you need to explicitly request it via the &#34;view&#34; parameter of the Get/List request.
     * 
    */
    public List<CloneJobResponse> recentCloneJobs() {
        return this.recentCloneJobs;
    }
    /**
     * The recent cutover jobs performed on the migrating VM. This field holds the vm&#39;s last completed cutover job and the vm&#39;s running cutover job, if one exists. Note: To have this field populated you need to explicitly request it via the &#34;view&#34; parameter of the Get/List request.
     * 
    */
    public List<CutoverJobResponse> recentCutoverJobs() {
        return this.recentCutoverJobs;
    }
    /**
     * The unique ID of the VM in the source. The VM&#39;s name in vSphere can be changed, so this is not the VM&#39;s name but rather its moRef id. This id is of the form vm-.
     * 
    */
    public String sourceVmId() {
        return this.sourceVmId;
    }
    /**
     * State of the MigratingVm.
     * 
    */
    public String state() {
        return this.state;
    }
    /**
     * The last time the migrating VM state was updated.
     * 
    */
    public String stateTime() {
        return this.stateTime;
    }
    /**
     * The last time the migrating VM resource was updated.
     * 
    */
    public String updateTime() {
        return this.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMigratingVmResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ComputeEngineTargetDefaultsResponse computeEngineTargetDefaults;
        private String createTime;
        private ReplicationCycleResponse currentSyncInfo;
        private String description;
        private String displayName;
        private StatusResponse error;
        private String group;
        private Map<String,String> labels;
        private ReplicationSyncResponse lastSync;
        private String name;
        private SchedulePolicyResponse policy;
        private List<CloneJobResponse> recentCloneJobs;
        private List<CutoverJobResponse> recentCutoverJobs;
        private String sourceVmId;
        private String state;
        private String stateTime;
        private String updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GetMigratingVmResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.computeEngineTargetDefaults = defaults.computeEngineTargetDefaults;
    	      this.createTime = defaults.createTime;
    	      this.currentSyncInfo = defaults.currentSyncInfo;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.error = defaults.error;
    	      this.group = defaults.group;
    	      this.labels = defaults.labels;
    	      this.lastSync = defaults.lastSync;
    	      this.name = defaults.name;
    	      this.policy = defaults.policy;
    	      this.recentCloneJobs = defaults.recentCloneJobs;
    	      this.recentCutoverJobs = defaults.recentCutoverJobs;
    	      this.sourceVmId = defaults.sourceVmId;
    	      this.state = defaults.state;
    	      this.stateTime = defaults.stateTime;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder computeEngineTargetDefaults(ComputeEngineTargetDefaultsResponse computeEngineTargetDefaults) {
            this.computeEngineTargetDefaults = Objects.requireNonNull(computeEngineTargetDefaults);
            return this;
        }
        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        public Builder currentSyncInfo(ReplicationCycleResponse currentSyncInfo) {
            this.currentSyncInfo = Objects.requireNonNull(currentSyncInfo);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder error(StatusResponse error) {
            this.error = Objects.requireNonNull(error);
            return this;
        }
        public Builder group(String group) {
            this.group = Objects.requireNonNull(group);
            return this;
        }
        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        public Builder lastSync(ReplicationSyncResponse lastSync) {
            this.lastSync = Objects.requireNonNull(lastSync);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder policy(SchedulePolicyResponse policy) {
            this.policy = Objects.requireNonNull(policy);
            return this;
        }
        public Builder recentCloneJobs(List<CloneJobResponse> recentCloneJobs) {
            this.recentCloneJobs = Objects.requireNonNull(recentCloneJobs);
            return this;
        }
        public Builder recentCloneJobs(CloneJobResponse... recentCloneJobs) {
            return recentCloneJobs(List.of(recentCloneJobs));
        }
        public Builder recentCutoverJobs(List<CutoverJobResponse> recentCutoverJobs) {
            this.recentCutoverJobs = Objects.requireNonNull(recentCutoverJobs);
            return this;
        }
        public Builder recentCutoverJobs(CutoverJobResponse... recentCutoverJobs) {
            return recentCutoverJobs(List.of(recentCutoverJobs));
        }
        public Builder sourceVmId(String sourceVmId) {
            this.sourceVmId = Objects.requireNonNull(sourceVmId);
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder stateTime(String stateTime) {
            this.stateTime = Objects.requireNonNull(stateTime);
            return this;
        }
        public Builder updateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }        public GetMigratingVmResult build() {
            return new GetMigratingVmResult(computeEngineTargetDefaults, createTime, currentSyncInfo, description, displayName, error, group, labels, lastSync, name, policy, recentCloneJobs, recentCutoverJobs, sourceVmId, state, stateTime, updateTime);
        }
    }
}
