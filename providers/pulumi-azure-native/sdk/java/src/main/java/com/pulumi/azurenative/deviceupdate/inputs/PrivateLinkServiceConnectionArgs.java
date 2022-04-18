// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.deviceupdate.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Private link service connection details.
 * 
 */
public final class PrivateLinkServiceConnectionArgs extends com.pulumi.resources.ResourceArgs {

    public static final PrivateLinkServiceConnectionArgs Empty = new PrivateLinkServiceConnectionArgs();

    /**
     * List of group IDs.
     * 
     */
    @Import(name="groupIds")
      private final @Nullable Output<List<String>> groupIds;

    public Output<List<String>> groupIds() {
        return this.groupIds == null ? Codegen.empty() : this.groupIds;
    }

    /**
     * Private link service connection name.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * Request message.
     * 
     */
    @Import(name="requestMessage")
      private final @Nullable Output<String> requestMessage;

    public Output<String> requestMessage() {
        return this.requestMessage == null ? Codegen.empty() : this.requestMessage;
    }

    public PrivateLinkServiceConnectionArgs(
        @Nullable Output<List<String>> groupIds,
        @Nullable Output<String> name,
        @Nullable Output<String> requestMessage) {
        this.groupIds = groupIds;
        this.name = name;
        this.requestMessage = requestMessage;
    }

    private PrivateLinkServiceConnectionArgs() {
        this.groupIds = Codegen.empty();
        this.name = Codegen.empty();
        this.requestMessage = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateLinkServiceConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> groupIds;
        private @Nullable Output<String> name;
        private @Nullable Output<String> requestMessage;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateLinkServiceConnectionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.groupIds = defaults.groupIds;
    	      this.name = defaults.name;
    	      this.requestMessage = defaults.requestMessage;
        }

        public Builder groupIds(@Nullable Output<List<String>> groupIds) {
            this.groupIds = groupIds;
            return this;
        }
        public Builder groupIds(@Nullable List<String> groupIds) {
            this.groupIds = Codegen.ofNullable(groupIds);
            return this;
        }
        public Builder groupIds(String... groupIds) {
            return groupIds(List.of(groupIds));
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder requestMessage(@Nullable Output<String> requestMessage) {
            this.requestMessage = requestMessage;
            return this;
        }
        public Builder requestMessage(@Nullable String requestMessage) {
            this.requestMessage = Codegen.ofNullable(requestMessage);
            return this;
        }        public PrivateLinkServiceConnectionArgs build() {
            return new PrivateLinkServiceConnectionArgs(groupIds, name, requestMessage);
        }
    }
}
