// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.deploymentmanager.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DeploymentTargetImportGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final DeploymentTargetImportGetArgs Empty = new DeploymentTargetImportGetArgs();

    /**
     * The full contents of the template that you want to import.
     * 
     */
    @Import(name="content")
    private @Nullable Output<String> content;

    public Optional<Output<String>> content() {
        return Optional.ofNullable(this.content);
    }

    /**
     * The name of the template to import, as declared in the YAML
     * configuration.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private DeploymentTargetImportGetArgs() {}

    private DeploymentTargetImportGetArgs(DeploymentTargetImportGetArgs $) {
        this.content = $.content;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeploymentTargetImportGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeploymentTargetImportGetArgs $;

        public Builder() {
            $ = new DeploymentTargetImportGetArgs();
        }

        public Builder(DeploymentTargetImportGetArgs defaults) {
            $ = new DeploymentTargetImportGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder content(@Nullable Output<String> content) {
            $.content = content;
            return this;
        }

        public Builder content(String content) {
            return content(Output.of(content));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public DeploymentTargetImportGetArgs build() {
            return $;
        }
    }

}
