// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1beta1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.containeranalysis_v1beta1.outputs.ByProductsResponse;
import io.pulumi.googlenative.containeranalysis_v1beta1.outputs.EnvironmentResponse;
import io.pulumi.googlenative.containeranalysis_v1beta1.outputs.GrafeasV1beta1IntotoArtifactResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class LinkResponse {
    /**
     * ByProducts are data generated as part of a software supply chain step, but are not the actual result of the step.
     * 
     */
    private final ByProductsResponse byproducts;
    /**
     * This field contains the full command executed for the step. This can also be empty if links are generated for operations that aren't directly mapped to a specific command. Each term in the command is an independent string in the list. An example of a command in the in-toto metadata field is: "command": ["git", "clone", "https://github.com/in-toto/demo-project.git"]
     * 
     */
    private final List<String> command;
    /**
     * This is a field that can be used to capture information about the environment. It is suggested for this field to contain information that details environment variables, filesystem information, and the present working directory. The recommended structure of this field is: "environment": { "custom_values": { "variables": "", "filesystem": "", "workdir": "", "": "..." } }
     * 
     */
    private final EnvironmentResponse environment;
    /**
     * Materials are the supply chain artifacts that go into the step and are used for the operation performed. The key of the map is the path of the artifact and the structure contains the recorded hash information. An example is: "materials": [ { "resource_uri": "foo/bar", "hashes": { "sha256": "ebebf...", : } } ]
     * 
     */
    private final List<GrafeasV1beta1IntotoArtifactResponse> materials;
    /**
     * Products are the supply chain artifacts generated as a result of the step. The structure is identical to that of materials.
     * 
     */
    private final List<GrafeasV1beta1IntotoArtifactResponse> products;

    @CustomType.Constructor
    private LinkResponse(
        @CustomType.Parameter("byproducts") ByProductsResponse byproducts,
        @CustomType.Parameter("command") List<String> command,
        @CustomType.Parameter("environment") EnvironmentResponse environment,
        @CustomType.Parameter("materials") List<GrafeasV1beta1IntotoArtifactResponse> materials,
        @CustomType.Parameter("products") List<GrafeasV1beta1IntotoArtifactResponse> products) {
        this.byproducts = byproducts;
        this.command = command;
        this.environment = environment;
        this.materials = materials;
        this.products = products;
    }

    /**
     * ByProducts are data generated as part of a software supply chain step, but are not the actual result of the step.
     * 
    */
    public ByProductsResponse byproducts() {
        return this.byproducts;
    }
    /**
     * This field contains the full command executed for the step. This can also be empty if links are generated for operations that aren't directly mapped to a specific command. Each term in the command is an independent string in the list. An example of a command in the in-toto metadata field is: "command": ["git", "clone", "https://github.com/in-toto/demo-project.git"]
     * 
    */
    public List<String> command() {
        return this.command;
    }
    /**
     * This is a field that can be used to capture information about the environment. It is suggested for this field to contain information that details environment variables, filesystem information, and the present working directory. The recommended structure of this field is: "environment": { "custom_values": { "variables": "", "filesystem": "", "workdir": "", "": "..." } }
     * 
    */
    public EnvironmentResponse environment() {
        return this.environment;
    }
    /**
     * Materials are the supply chain artifacts that go into the step and are used for the operation performed. The key of the map is the path of the artifact and the structure contains the recorded hash information. An example is: "materials": [ { "resource_uri": "foo/bar", "hashes": { "sha256": "ebebf...", : } } ]
     * 
    */
    public List<GrafeasV1beta1IntotoArtifactResponse> materials() {
        return this.materials;
    }
    /**
     * Products are the supply chain artifacts generated as a result of the step. The structure is identical to that of materials.
     * 
    */
    public List<GrafeasV1beta1IntotoArtifactResponse> products() {
        return this.products;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LinkResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ByProductsResponse byproducts;
        private List<String> command;
        private EnvironmentResponse environment;
        private List<GrafeasV1beta1IntotoArtifactResponse> materials;
        private List<GrafeasV1beta1IntotoArtifactResponse> products;

        public Builder() {
    	      // Empty
        }

        public Builder(LinkResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.byproducts = defaults.byproducts;
    	      this.command = defaults.command;
    	      this.environment = defaults.environment;
    	      this.materials = defaults.materials;
    	      this.products = defaults.products;
        }

        public Builder byproducts(ByProductsResponse byproducts) {
            this.byproducts = Objects.requireNonNull(byproducts);
            return this;
        }
        public Builder command(List<String> command) {
            this.command = Objects.requireNonNull(command);
            return this;
        }
        public Builder command(String... command) {
            return command(List.of(command));
        }
        public Builder environment(EnvironmentResponse environment) {
            this.environment = Objects.requireNonNull(environment);
            return this;
        }
        public Builder materials(List<GrafeasV1beta1IntotoArtifactResponse> materials) {
            this.materials = Objects.requireNonNull(materials);
            return this;
        }
        public Builder materials(GrafeasV1beta1IntotoArtifactResponse... materials) {
            return materials(List.of(materials));
        }
        public Builder products(List<GrafeasV1beta1IntotoArtifactResponse> products) {
            this.products = Objects.requireNonNull(products);
            return this;
        }
        public Builder products(GrafeasV1beta1IntotoArtifactResponse... products) {
            return products(List.of(products));
        }        public LinkResponse build() {
            return new LinkResponse(byproducts, command, environment, materials, products);
        }
    }
}
