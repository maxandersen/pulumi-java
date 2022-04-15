// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningexperimentation.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetProjectResult {
    /**
     * The immutable id of the team account which contains this project.
     * 
     */
    private final String accountId;
    /**
     * The creation date of the project in ISO8601 format.
     * 
     */
    private final String creationDate;
    /**
     * The description of this project.
     * 
     */
    private final @Nullable String description;
    /**
     * The friendly name for this project.
     * 
     */
    private final String friendlyName;
    /**
     * The reference to git repo for this project.
     * 
     */
    private final @Nullable String gitrepo;
    /**
     * The resource ID.
     * 
     */
    private final String id;
    /**
     * The location of the resource. This cannot be changed after the resource is created.
     * 
     */
    private final String location;
    /**
     * The name of the resource.
     * 
     */
    private final String name;
    /**
     * The immutable id of this project.
     * 
     */
    private final String projectId;
    /**
     * The current deployment state of project resource. The provisioningState is to indicate states for resource provisioning.
     * 
     */
    private final String provisioningState;
    /**
     * The tags of the resource.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * The type of the resource.
     * 
     */
    private final String type;
    /**
     * The immutable id of the workspace which contains this project.
     * 
     */
    private final String workspaceId;

    @CustomType.Constructor
    private GetProjectResult(
        @CustomType.Parameter("accountId") String accountId,
        @CustomType.Parameter("creationDate") String creationDate,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("friendlyName") String friendlyName,
        @CustomType.Parameter("gitrepo") @Nullable String gitrepo,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("projectId") String projectId,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("workspaceId") String workspaceId) {
        this.accountId = accountId;
        this.creationDate = creationDate;
        this.description = description;
        this.friendlyName = friendlyName;
        this.gitrepo = gitrepo;
        this.id = id;
        this.location = location;
        this.name = name;
        this.projectId = projectId;
        this.provisioningState = provisioningState;
        this.tags = tags;
        this.type = type;
        this.workspaceId = workspaceId;
    }

    /**
     * The immutable id of the team account which contains this project.
     * 
    */
    public String accountId() {
        return this.accountId;
    }
    /**
     * The creation date of the project in ISO8601 format.
     * 
    */
    public String creationDate() {
        return this.creationDate;
    }
    /**
     * The description of this project.
     * 
    */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * The friendly name for this project.
     * 
    */
    public String friendlyName() {
        return this.friendlyName;
    }
    /**
     * The reference to git repo for this project.
     * 
    */
    public Optional<String> gitrepo() {
        return Optional.ofNullable(this.gitrepo);
    }
    /**
     * The resource ID.
     * 
    */
    public String id() {
        return this.id;
    }
    /**
     * The location of the resource. This cannot be changed after the resource is created.
     * 
    */
    public String location() {
        return this.location;
    }
    /**
     * The name of the resource.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * The immutable id of this project.
     * 
    */
    public String projectId() {
        return this.projectId;
    }
    /**
     * The current deployment state of project resource. The provisioningState is to indicate states for resource provisioning.
     * 
    */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * The tags of the resource.
     * 
    */
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * The type of the resource.
     * 
    */
    public String type() {
        return this.type;
    }
    /**
     * The immutable id of the workspace which contains this project.
     * 
    */
    public String workspaceId() {
        return this.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetProjectResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accountId;
        private String creationDate;
        private @Nullable String description;
        private String friendlyName;
        private @Nullable String gitrepo;
        private String id;
        private String location;
        private String name;
        private String projectId;
        private String provisioningState;
        private @Nullable Map<String,String> tags;
        private String type;
        private String workspaceId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetProjectResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.creationDate = defaults.creationDate;
    	      this.description = defaults.description;
    	      this.friendlyName = defaults.friendlyName;
    	      this.gitrepo = defaults.gitrepo;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.projectId = defaults.projectId;
    	      this.provisioningState = defaults.provisioningState;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.workspaceId = defaults.workspaceId;
        }

        public Builder accountId(String accountId) {
            this.accountId = Objects.requireNonNull(accountId);
            return this;
        }
        public Builder creationDate(String creationDate) {
            this.creationDate = Objects.requireNonNull(creationDate);
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder friendlyName(String friendlyName) {
            this.friendlyName = Objects.requireNonNull(friendlyName);
            return this;
        }
        public Builder gitrepo(@Nullable String gitrepo) {
            this.gitrepo = gitrepo;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder projectId(String projectId) {
            this.projectId = Objects.requireNonNull(projectId);
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder workspaceId(String workspaceId) {
            this.workspaceId = Objects.requireNonNull(workspaceId);
            return this;
        }        public GetProjectResult build() {
            return new GetProjectResult(accountId, creationDate, description, friendlyName, gitrepo, id, location, name, projectId, provisioningState, tags, type, workspaceId);
        }
    }
}
