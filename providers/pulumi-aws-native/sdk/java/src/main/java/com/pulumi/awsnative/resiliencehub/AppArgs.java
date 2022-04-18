// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.resiliencehub;

import com.pulumi.awsnative.resiliencehub.inputs.AppResourceMappingArgs;
import com.pulumi.awsnative.resiliencehub.inputs.AppTagMapArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AppArgs extends com.pulumi.resources.ResourceArgs {

    public static final AppArgs Empty = new AppArgs();

    /**
     * A string containing full ResilienceHub app template body.
     * 
     */
    @Import(name="appTemplateBody", required=true)
      private final Output<String> appTemplateBody;

    public Output<String> appTemplateBody() {
        return this.appTemplateBody;
    }

    /**
     * App description.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * Name of the app.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * Amazon Resource Name (ARN) of the Resiliency Policy.
     * 
     */
    @Import(name="resiliencyPolicyArn")
      private final @Nullable Output<String> resiliencyPolicyArn;

    public Output<String> resiliencyPolicyArn() {
        return this.resiliencyPolicyArn == null ? Codegen.empty() : this.resiliencyPolicyArn;
    }

    /**
     * An array of ResourceMapping objects.
     * 
     */
    @Import(name="resourceMappings", required=true)
      private final Output<List<AppResourceMappingArgs>> resourceMappings;

    public Output<List<AppResourceMappingArgs>> resourceMappings() {
        return this.resourceMappings;
    }

    @Import(name="tags")
      private final @Nullable Output<AppTagMapArgs> tags;

    public Output<AppTagMapArgs> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    public AppArgs(
        Output<String> appTemplateBody,
        @Nullable Output<String> description,
        @Nullable Output<String> name,
        @Nullable Output<String> resiliencyPolicyArn,
        Output<List<AppResourceMappingArgs>> resourceMappings,
        @Nullable Output<AppTagMapArgs> tags) {
        this.appTemplateBody = Objects.requireNonNull(appTemplateBody, "expected parameter 'appTemplateBody' to be non-null");
        this.description = description;
        this.name = name;
        this.resiliencyPolicyArn = resiliencyPolicyArn;
        this.resourceMappings = Objects.requireNonNull(resourceMappings, "expected parameter 'resourceMappings' to be non-null");
        this.tags = tags;
    }

    private AppArgs() {
        this.appTemplateBody = Codegen.empty();
        this.description = Codegen.empty();
        this.name = Codegen.empty();
        this.resiliencyPolicyArn = Codegen.empty();
        this.resourceMappings = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> appTemplateBody;
        private @Nullable Output<String> description;
        private @Nullable Output<String> name;
        private @Nullable Output<String> resiliencyPolicyArn;
        private Output<List<AppResourceMappingArgs>> resourceMappings;
        private @Nullable Output<AppTagMapArgs> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(AppArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appTemplateBody = defaults.appTemplateBody;
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.resiliencyPolicyArn = defaults.resiliencyPolicyArn;
    	      this.resourceMappings = defaults.resourceMappings;
    	      this.tags = defaults.tags;
        }

        public Builder appTemplateBody(Output<String> appTemplateBody) {
            this.appTemplateBody = Objects.requireNonNull(appTemplateBody);
            return this;
        }
        public Builder appTemplateBody(String appTemplateBody) {
            this.appTemplateBody = Output.of(Objects.requireNonNull(appTemplateBody));
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
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder resiliencyPolicyArn(@Nullable Output<String> resiliencyPolicyArn) {
            this.resiliencyPolicyArn = resiliencyPolicyArn;
            return this;
        }
        public Builder resiliencyPolicyArn(@Nullable String resiliencyPolicyArn) {
            this.resiliencyPolicyArn = Codegen.ofNullable(resiliencyPolicyArn);
            return this;
        }
        public Builder resourceMappings(Output<List<AppResourceMappingArgs>> resourceMappings) {
            this.resourceMappings = Objects.requireNonNull(resourceMappings);
            return this;
        }
        public Builder resourceMappings(List<AppResourceMappingArgs> resourceMappings) {
            this.resourceMappings = Output.of(Objects.requireNonNull(resourceMappings));
            return this;
        }
        public Builder resourceMappings(AppResourceMappingArgs... resourceMappings) {
            return resourceMappings(List.of(resourceMappings));
        }
        public Builder tags(@Nullable Output<AppTagMapArgs> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable AppTagMapArgs tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }        public AppArgs build() {
            return new AppArgs(appTemplateBody, description, name, resiliencyPolicyArn, resourceMappings, tags);
        }
    }
}
