// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.managedidentities_v1alpha1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetBackupResult {
    /**
     * The time the backups was created.
     * 
     */
    private final String createTime;
    /**
     * Optional. Resource labels to represent user provided metadata.
     * 
     */
    private final Map<String,String> labels;
    /**
     * The unique name of the Backup in the form of projects/{project_id}/locations/global/domains/{domain_name}/backups/{name}
     * 
     */
    private final String name;
    /**
     * The current state of the backup.
     * 
     */
    private final String state;
    /**
     * Additional information about the current status of this backup, if available.
     * 
     */
    private final String statusMessage;
    /**
     * Indicates whether it’s an on-demand backup or scheduled.
     * 
     */
    private final String type;
    /**
     * Last update time.
     * 
     */
    private final String updateTime;

    @CustomType.Constructor
    private GetBackupResult(
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("labels") Map<String,String> labels,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("statusMessage") String statusMessage,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("updateTime") String updateTime) {
        this.createTime = createTime;
        this.labels = labels;
        this.name = name;
        this.state = state;
        this.statusMessage = statusMessage;
        this.type = type;
        this.updateTime = updateTime;
    }

    /**
     * The time the backups was created.
     * 
    */
    public String createTime() {
        return this.createTime;
    }
    /**
     * Optional. Resource labels to represent user provided metadata.
     * 
    */
    public Map<String,String> labels() {
        return this.labels;
    }
    /**
     * The unique name of the Backup in the form of projects/{project_id}/locations/global/domains/{domain_name}/backups/{name}
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * The current state of the backup.
     * 
    */
    public String state() {
        return this.state;
    }
    /**
     * Additional information about the current status of this backup, if available.
     * 
    */
    public String statusMessage() {
        return this.statusMessage;
    }
    /**
     * Indicates whether it’s an on-demand backup or scheduled.
     * 
    */
    public String type() {
        return this.type;
    }
    /**
     * Last update time.
     * 
    */
    public String updateTime() {
        return this.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBackupResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createTime;
        private Map<String,String> labels;
        private String name;
        private String state;
        private String statusMessage;
        private String type;
        private String updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBackupResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.state = defaults.state;
    	      this.statusMessage = defaults.statusMessage;
    	      this.type = defaults.type;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder statusMessage(String statusMessage) {
            this.statusMessage = Objects.requireNonNull(statusMessage);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder updateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }        public GetBackupResult build() {
            return new GetBackupResult(createTime, labels, name, state, statusMessage, type, updateTime);
        }
    }
}
