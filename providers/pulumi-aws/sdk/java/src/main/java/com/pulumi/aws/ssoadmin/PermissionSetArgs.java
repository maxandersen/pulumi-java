// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ssoadmin;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PermissionSetArgs extends com.pulumi.resources.ResourceArgs {

    public static final PermissionSetArgs Empty = new PermissionSetArgs();

    /**
     * The description of the Permission Set.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * The Amazon Resource Name (ARN) of the SSO Instance under which the operation will be executed.
     * 
     */
    @Import(name="instanceArn", required=true)
      private final Output<String> instanceArn;

    public Output<String> instanceArn() {
        return this.instanceArn;
    }

    /**
     * The name of the Permission Set.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The relay state URL used to redirect users within the application during the federation authentication process.
     * 
     */
    @Import(name="relayState")
      private final @Nullable Output<String> relayState;

    public Output<String> relayState() {
        return this.relayState == null ? Codegen.empty() : this.relayState;
    }

    /**
     * The length of time that the application user sessions are valid in the ISO-8601 standard. Default: `PT1H`.
     * 
     */
    @Import(name="sessionDuration")
      private final @Nullable Output<String> sessionDuration;

    public Output<String> sessionDuration() {
        return this.sessionDuration == null ? Codegen.empty() : this.sessionDuration;
    }

    /**
     * Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    public PermissionSetArgs(
        @Nullable Output<String> description,
        Output<String> instanceArn,
        @Nullable Output<String> name,
        @Nullable Output<String> relayState,
        @Nullable Output<String> sessionDuration,
        @Nullable Output<Map<String,String>> tags) {
        this.description = description;
        this.instanceArn = Objects.requireNonNull(instanceArn, "expected parameter 'instanceArn' to be non-null");
        this.name = name;
        this.relayState = relayState;
        this.sessionDuration = sessionDuration;
        this.tags = tags;
    }

    private PermissionSetArgs() {
        this.description = Codegen.empty();
        this.instanceArn = Codegen.empty();
        this.name = Codegen.empty();
        this.relayState = Codegen.empty();
        this.sessionDuration = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PermissionSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private Output<String> instanceArn;
        private @Nullable Output<String> name;
        private @Nullable Output<String> relayState;
        private @Nullable Output<String> sessionDuration;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(PermissionSetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.instanceArn = defaults.instanceArn;
    	      this.name = defaults.name;
    	      this.relayState = defaults.relayState;
    	      this.sessionDuration = defaults.sessionDuration;
    	      this.tags = defaults.tags;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder instanceArn(Output<String> instanceArn) {
            this.instanceArn = Objects.requireNonNull(instanceArn);
            return this;
        }
        public Builder instanceArn(String instanceArn) {
            this.instanceArn = Output.of(Objects.requireNonNull(instanceArn));
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
        public Builder relayState(@Nullable Output<String> relayState) {
            this.relayState = relayState;
            return this;
        }
        public Builder relayState(@Nullable String relayState) {
            this.relayState = Codegen.ofNullable(relayState);
            return this;
        }
        public Builder sessionDuration(@Nullable Output<String> sessionDuration) {
            this.sessionDuration = sessionDuration;
            return this;
        }
        public Builder sessionDuration(@Nullable String sessionDuration) {
            this.sessionDuration = Codegen.ofNullable(sessionDuration);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }        public PermissionSetArgs build() {
            return new PermissionSetArgs(description, instanceArn, name, relayState, sessionDuration, tags);
        }
    }
}
