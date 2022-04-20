// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.monitoring_v3;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.monitoring_v3.enums.NotificationChannelVerificationStatus;
import com.pulumi.googlenative.monitoring_v3.inputs.MutationRecordArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NotificationChannelArgs extends com.pulumi.resources.ResourceArgs {

    public static final NotificationChannelArgs Empty = new NotificationChannelArgs();

    /**
     * Record of the creation of this channel.
     * 
     */
    @Import(name="creationRecord")
      private final @Nullable Output<MutationRecordArgs> creationRecord;

    public Output<MutationRecordArgs> creationRecord() {
        return this.creationRecord == null ? Codegen.empty() : this.creationRecord;
    }

    /**
     * An optional human-readable description of this notification channel. This description may provide additional details, beyond the display name, for the channel. This may not exceed 1024 Unicode characters.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * An optional human-readable name for this notification channel. It is recommended that you specify a non-empty and unique name in order to make it easier to identify the channels in your project, though this is not enforced. The display name is limited to 512 Unicode characters.
     * 
     */
    @Import(name="displayName")
      private final @Nullable Output<String> displayName;

    public Output<String> displayName() {
        return this.displayName == null ? Codegen.empty() : this.displayName;
    }

    /**
     * Whether notifications are forwarded to the described channel. This makes it possible to disable delivery of notifications to a particular channel without removing the channel from all alerting policies that reference the channel. This is a more convenient approach when the change is temporary and you want to receive notifications from the same set of alerting policies on the channel at some point in the future.
     * 
     */
    @Import(name="enabled")
      private final @Nullable Output<Boolean> enabled;

    public Output<Boolean> enabled() {
        return this.enabled == null ? Codegen.empty() : this.enabled;
    }

    /**
     * Configuration fields that define the channel and its behavior. The permissible and required labels are specified in the NotificationChannelDescriptor.labels of the NotificationChannelDescriptor corresponding to the type field.
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<Map<String,String>> labels;

    public Output<Map<String,String>> labels() {
        return this.labels == null ? Codegen.empty() : this.labels;
    }

    /**
     * Records of the modification of this channel.
     * 
     */
    @Import(name="mutationRecords")
      private final @Nullable Output<List<MutationRecordArgs>> mutationRecords;

    public Output<List<MutationRecordArgs>> mutationRecords() {
        return this.mutationRecords == null ? Codegen.empty() : this.mutationRecords;
    }

    /**
     * The full REST resource name for this channel. The format is: projects/[PROJECT_ID_OR_NUMBER]/notificationChannels/[CHANNEL_ID] The [CHANNEL_ID] is automatically assigned by the server on creation.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    /**
     * The type of the notification channel. This field matches the value of the NotificationChannelDescriptor.type field.
     * 
     */
    @Import(name="type")
      private final @Nullable Output<String> type;

    public Output<String> type() {
        return this.type == null ? Codegen.empty() : this.type;
    }

    /**
     * User-supplied key/value data that does not need to conform to the corresponding NotificationChannelDescriptor&#39;s schema, unlike the labels field. This field is intended to be used for organizing and identifying the NotificationChannel objects.The field can contain up to 64 entries. Each key and value is limited to 63 Unicode characters or 128 bytes, whichever is smaller. Labels and values can contain only lowercase letters, numerals, underscores, and dashes. Keys must begin with a letter.
     * 
     */
    @Import(name="userLabels")
      private final @Nullable Output<Map<String,String>> userLabels;

    public Output<Map<String,String>> userLabels() {
        return this.userLabels == null ? Codegen.empty() : this.userLabels;
    }

    /**
     * Indicates whether this channel has been verified or not. On a ListNotificationChannels or GetNotificationChannel operation, this field is expected to be populated.If the value is UNVERIFIED, then it indicates that the channel is non-functioning (it both requires verification and lacks verification); otherwise, it is assumed that the channel works.If the channel is neither VERIFIED nor UNVERIFIED, it implies that the channel is of a type that does not require verification or that this specific channel has been exempted from verification because it was created prior to verification being required for channels of this type.This field cannot be modified using a standard UpdateNotificationChannel operation. To change the value of this field, you must call VerifyNotificationChannel.
     * 
     */
    @Import(name="verificationStatus")
      private final @Nullable Output<NotificationChannelVerificationStatus> verificationStatus;

    public Output<NotificationChannelVerificationStatus> verificationStatus() {
        return this.verificationStatus == null ? Codegen.empty() : this.verificationStatus;
    }

    public NotificationChannelArgs(
        @Nullable Output<MutationRecordArgs> creationRecord,
        @Nullable Output<String> description,
        @Nullable Output<String> displayName,
        @Nullable Output<Boolean> enabled,
        @Nullable Output<Map<String,String>> labels,
        @Nullable Output<List<MutationRecordArgs>> mutationRecords,
        @Nullable Output<String> name,
        @Nullable Output<String> project,
        @Nullable Output<String> type,
        @Nullable Output<Map<String,String>> userLabels,
        @Nullable Output<NotificationChannelVerificationStatus> verificationStatus) {
        this.creationRecord = creationRecord;
        this.description = description;
        this.displayName = displayName;
        this.enabled = enabled;
        this.labels = labels;
        this.mutationRecords = mutationRecords;
        this.name = name;
        this.project = project;
        this.type = type;
        this.userLabels = userLabels;
        this.verificationStatus = verificationStatus;
    }

    private NotificationChannelArgs() {
        this.creationRecord = Codegen.empty();
        this.description = Codegen.empty();
        this.displayName = Codegen.empty();
        this.enabled = Codegen.empty();
        this.labels = Codegen.empty();
        this.mutationRecords = Codegen.empty();
        this.name = Codegen.empty();
        this.project = Codegen.empty();
        this.type = Codegen.empty();
        this.userLabels = Codegen.empty();
        this.verificationStatus = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NotificationChannelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<MutationRecordArgs> creationRecord;
        private @Nullable Output<String> description;
        private @Nullable Output<String> displayName;
        private @Nullable Output<Boolean> enabled;
        private @Nullable Output<Map<String,String>> labels;
        private @Nullable Output<List<MutationRecordArgs>> mutationRecords;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;
        private @Nullable Output<String> type;
        private @Nullable Output<Map<String,String>> userLabels;
        private @Nullable Output<NotificationChannelVerificationStatus> verificationStatus;

        public Builder() {
    	      // Empty
        }

        public Builder(NotificationChannelArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.creationRecord = defaults.creationRecord;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.enabled = defaults.enabled;
    	      this.labels = defaults.labels;
    	      this.mutationRecords = defaults.mutationRecords;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.type = defaults.type;
    	      this.userLabels = defaults.userLabels;
    	      this.verificationStatus = defaults.verificationStatus;
        }

        public Builder creationRecord(@Nullable Output<MutationRecordArgs> creationRecord) {
            this.creationRecord = creationRecord;
            return this;
        }
        public Builder creationRecord(@Nullable MutationRecordArgs creationRecord) {
            this.creationRecord = Codegen.ofNullable(creationRecord);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder displayName(@Nullable Output<String> displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder displayName(@Nullable String displayName) {
            this.displayName = Codegen.ofNullable(displayName);
            return this;
        }
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = Codegen.ofNullable(enabled);
            return this;
        }
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }
        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = Codegen.ofNullable(labels);
            return this;
        }
        public Builder mutationRecords(@Nullable Output<List<MutationRecordArgs>> mutationRecords) {
            this.mutationRecords = mutationRecords;
            return this;
        }
        public Builder mutationRecords(@Nullable List<MutationRecordArgs> mutationRecords) {
            this.mutationRecords = Codegen.ofNullable(mutationRecords);
            return this;
        }
        public Builder mutationRecords(MutationRecordArgs... mutationRecords) {
            return mutationRecords(List.of(mutationRecords));
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder type(@Nullable Output<String> type) {
            this.type = type;
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = Codegen.ofNullable(type);
            return this;
        }
        public Builder userLabels(@Nullable Output<Map<String,String>> userLabels) {
            this.userLabels = userLabels;
            return this;
        }
        public Builder userLabels(@Nullable Map<String,String> userLabels) {
            this.userLabels = Codegen.ofNullable(userLabels);
            return this;
        }
        public Builder verificationStatus(@Nullable Output<NotificationChannelVerificationStatus> verificationStatus) {
            this.verificationStatus = verificationStatus;
            return this;
        }
        public Builder verificationStatus(@Nullable NotificationChannelVerificationStatus verificationStatus) {
            this.verificationStatus = Codegen.ofNullable(verificationStatus);
            return this;
        }        public NotificationChannelArgs build() {
            return new NotificationChannelArgs(creationRecord, description, displayName, enabled, labels, mutationRecords, name, project, type, userLabels, verificationStatus);
        }
    }
}
