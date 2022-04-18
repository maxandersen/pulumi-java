// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.backup.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class BackupVaultNotificationObjectType extends com.pulumi.resources.InvokeArgs {

    public static final BackupVaultNotificationObjectType Empty = new BackupVaultNotificationObjectType();

    @Import(name="backupVaultEvents", required=true)
      private final List<String> backupVaultEvents;

    public List<String> backupVaultEvents() {
        return this.backupVaultEvents;
    }

    @Import(name="sNSTopicArn", required=true)
      private final String sNSTopicArn;

    public String sNSTopicArn() {
        return this.sNSTopicArn;
    }

    public BackupVaultNotificationObjectType(
        List<String> backupVaultEvents,
        String sNSTopicArn) {
        this.backupVaultEvents = Objects.requireNonNull(backupVaultEvents, "expected parameter 'backupVaultEvents' to be non-null");
        this.sNSTopicArn = Objects.requireNonNull(sNSTopicArn, "expected parameter 'sNSTopicArn' to be non-null");
    }

    private BackupVaultNotificationObjectType() {
        this.backupVaultEvents = List.of();
        this.sNSTopicArn = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackupVaultNotificationObjectType defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> backupVaultEvents;
        private String sNSTopicArn;

        public Builder() {
    	      // Empty
        }

        public Builder(BackupVaultNotificationObjectType defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupVaultEvents = defaults.backupVaultEvents;
    	      this.sNSTopicArn = defaults.sNSTopicArn;
        }

        public Builder backupVaultEvents(List<String> backupVaultEvents) {
            this.backupVaultEvents = Objects.requireNonNull(backupVaultEvents);
            return this;
        }
        public Builder backupVaultEvents(String... backupVaultEvents) {
            return backupVaultEvents(List.of(backupVaultEvents));
        }
        public Builder sNSTopicArn(String sNSTopicArn) {
            this.sNSTopicArn = Objects.requireNonNull(sNSTopicArn);
            return this;
        }        public BackupVaultNotificationObjectType build() {
            return new BackupVaultNotificationObjectType(backupVaultEvents, sNSTopicArn);
        }
    }
}
