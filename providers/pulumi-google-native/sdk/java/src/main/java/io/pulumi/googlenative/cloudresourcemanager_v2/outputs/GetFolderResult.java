// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudresourcemanager_v2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetFolderResult {
    /**
     * Timestamp when the Folder was created. Assigned by the server.
     * 
     */
    private final String createTime;
    /**
     * The folder's display name. A folder's display name must be unique amongst its siblings, e.g. no two folders with the same parent can share the same display name. The display name must start and end with a letter or digit, may contain letters, digits, spaces, hyphens and underscores and can be no longer than 30 characters. This is captured by the regular expression: `[\p{L}\p{N}]([\p{L}\p{N}_- ]{0,28}[\p{L}\p{N}])?`.
     * 
     */
    private final String displayName;
    /**
     * The lifecycle state of the folder. Updates to the lifecycle_state must be performed via DeleteFolder and UndeleteFolder.
     * 
     */
    private final String lifecycleState;
    /**
     * The resource name of the Folder. Its format is `folders/{folder_id}`, for example: "folders/1234".
     * 
     */
    private final String name;
    /**
     * The Folder's parent's resource name. Updates to the folder's parent must be performed via MoveFolder.
     * 
     */
    private final String parent;

    @OutputCustomType.Constructor
    private GetFolderResult(
        @OutputCustomType.Parameter("createTime") String createTime,
        @OutputCustomType.Parameter("displayName") String displayName,
        @OutputCustomType.Parameter("lifecycleState") String lifecycleState,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("parent") String parent) {
        this.createTime = createTime;
        this.displayName = displayName;
        this.lifecycleState = lifecycleState;
        this.name = name;
        this.parent = parent;
    }

    /**
     * Timestamp when the Folder was created. Assigned by the server.
     * 
    */
    public String getCreateTime() {
        return this.createTime;
    }
    /**
     * The folder's display name. A folder's display name must be unique amongst its siblings, e.g. no two folders with the same parent can share the same display name. The display name must start and end with a letter or digit, may contain letters, digits, spaces, hyphens and underscores and can be no longer than 30 characters. This is captured by the regular expression: `[\p{L}\p{N}]([\p{L}\p{N}_- ]{0,28}[\p{L}\p{N}])?`.
     * 
    */
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The lifecycle state of the folder. Updates to the lifecycle_state must be performed via DeleteFolder and UndeleteFolder.
     * 
    */
    public String getLifecycleState() {
        return this.lifecycleState;
    }
    /**
     * The resource name of the Folder. Its format is `folders/{folder_id}`, for example: "folders/1234".
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The Folder's parent's resource name. Updates to the folder's parent must be performed via MoveFolder.
     * 
    */
    public String getParent() {
        return this.parent;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFolderResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createTime;
        private String displayName;
        private String lifecycleState;
        private String name;
        private String parent;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFolderResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.displayName = defaults.displayName;
    	      this.lifecycleState = defaults.lifecycleState;
    	      this.name = defaults.name;
    	      this.parent = defaults.parent;
        }

        public Builder setCreateTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setLifecycleState(String lifecycleState) {
            this.lifecycleState = Objects.requireNonNull(lifecycleState);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setParent(String parent) {
            this.parent = Objects.requireNonNull(parent);
            return this;
        }
        public GetFolderResult build() {
            return new GetFolderResult(createTime, displayName, lifecycleState, name, parent);
        }
    }
}
