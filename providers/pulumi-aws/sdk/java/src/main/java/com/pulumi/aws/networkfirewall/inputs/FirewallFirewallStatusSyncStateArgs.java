// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.networkfirewall.inputs;

import com.pulumi.aws.networkfirewall.inputs.FirewallFirewallStatusSyncStateAttachmentArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FirewallFirewallStatusSyncStateArgs extends com.pulumi.resources.ResourceArgs {

    public static final FirewallFirewallStatusSyncStateArgs Empty = new FirewallFirewallStatusSyncStateArgs();

    /**
     * Nested list describing the attachment status of the firewall&#39;s association with a single VPC subnet.
     * 
     */
    @Import(name="attachments")
      private final @Nullable Output<List<FirewallFirewallStatusSyncStateAttachmentArgs>> attachments;

    public Output<List<FirewallFirewallStatusSyncStateAttachmentArgs>> attachments() {
        return this.attachments == null ? Codegen.empty() : this.attachments;
    }

    /**
     * The Availability Zone where the subnet is configured.
     * 
     */
    @Import(name="availabilityZone")
      private final @Nullable Output<String> availabilityZone;

    public Output<String> availabilityZone() {
        return this.availabilityZone == null ? Codegen.empty() : this.availabilityZone;
    }

    public FirewallFirewallStatusSyncStateArgs(
        @Nullable Output<List<FirewallFirewallStatusSyncStateAttachmentArgs>> attachments,
        @Nullable Output<String> availabilityZone) {
        this.attachments = attachments;
        this.availabilityZone = availabilityZone;
    }

    private FirewallFirewallStatusSyncStateArgs() {
        this.attachments = Codegen.empty();
        this.availabilityZone = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallFirewallStatusSyncStateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<FirewallFirewallStatusSyncStateAttachmentArgs>> attachments;
        private @Nullable Output<String> availabilityZone;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallFirewallStatusSyncStateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attachments = defaults.attachments;
    	      this.availabilityZone = defaults.availabilityZone;
        }

        public Builder attachments(@Nullable Output<List<FirewallFirewallStatusSyncStateAttachmentArgs>> attachments) {
            this.attachments = attachments;
            return this;
        }
        public Builder attachments(@Nullable List<FirewallFirewallStatusSyncStateAttachmentArgs> attachments) {
            this.attachments = Codegen.ofNullable(attachments);
            return this;
        }
        public Builder attachments(FirewallFirewallStatusSyncStateAttachmentArgs... attachments) {
            return attachments(List.of(attachments));
        }
        public Builder availabilityZone(@Nullable Output<String> availabilityZone) {
            this.availabilityZone = availabilityZone;
            return this;
        }
        public Builder availabilityZone(@Nullable String availabilityZone) {
            this.availabilityZone = Codegen.ofNullable(availabilityZone);
            return this;
        }        public FirewallFirewallStatusSyncStateArgs build() {
            return new FirewallFirewallStatusSyncStateArgs(attachments, availabilityZone);
        }
    }
}
