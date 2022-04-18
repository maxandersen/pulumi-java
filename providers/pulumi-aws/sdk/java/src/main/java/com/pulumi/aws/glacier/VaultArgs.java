// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.glacier;

import com.pulumi.aws.glacier.inputs.VaultNotificationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VaultArgs extends com.pulumi.resources.ResourceArgs {

    public static final VaultArgs Empty = new VaultArgs();

    /**
     * The policy document. This is a JSON formatted string.
     * The heredoc syntax or `file` function is helpful here. Use the [Glacier Developer Guide](https://docs.aws.amazon.com/amazonglacier/latest/dev/vault-access-policy.html) for more information on Glacier Vault Policy
     * 
     */
    @Import(name="accessPolicy")
      private final @Nullable Output<String> accessPolicy;

    public Output<String> accessPolicy() {
        return this.accessPolicy == null ? Codegen.empty() : this.accessPolicy;
    }

    /**
     * The name of the Vault. Names can be between 1 and 255 characters long and the valid characters are a-z, A-Z, 0-9, '_' (underscore), '-' (hyphen), and '.' (period).
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The notifications for the Vault. Fields documented below.
     * 
     */
    @Import(name="notification")
      private final @Nullable Output<VaultNotificationArgs> notification;

    public Output<VaultNotificationArgs> notification() {
        return this.notification == null ? Codegen.empty() : this.notification;
    }

    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    public VaultArgs(
        @Nullable Output<String> accessPolicy,
        @Nullable Output<String> name,
        @Nullable Output<VaultNotificationArgs> notification,
        @Nullable Output<Map<String,String>> tags) {
        this.accessPolicy = accessPolicy;
        this.name = name;
        this.notification = notification;
        this.tags = tags;
    }

    private VaultArgs() {
        this.accessPolicy = Codegen.empty();
        this.name = Codegen.empty();
        this.notification = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VaultArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> accessPolicy;
        private @Nullable Output<String> name;
        private @Nullable Output<VaultNotificationArgs> notification;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(VaultArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessPolicy = defaults.accessPolicy;
    	      this.name = defaults.name;
    	      this.notification = defaults.notification;
    	      this.tags = defaults.tags;
        }

        public Builder accessPolicy(@Nullable Output<String> accessPolicy) {
            this.accessPolicy = accessPolicy;
            return this;
        }
        public Builder accessPolicy(@Nullable String accessPolicy) {
            this.accessPolicy = Codegen.ofNullable(accessPolicy);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder notification(@Nullable Output<VaultNotificationArgs> notification) {
            this.notification = notification;
            return this;
        }
        public Builder notification(@Nullable VaultNotificationArgs notification) {
            this.notification = Codegen.ofNullable(notification);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }        public VaultArgs build() {
            return new VaultArgs(accessPolicy, name, notification, tags);
        }
    }
}
