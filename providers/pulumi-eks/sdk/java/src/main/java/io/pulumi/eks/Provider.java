// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.eks;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.eks.ProviderArgs;
import io.pulumi.eks.Utilities;
import javax.annotation.Nullable;

@ResourceType(type="pulumi:providers:eks")
public class Provider extends io.pulumi.resources.ProviderResource {
    public interface BuilderApplicator {
        public void apply(@Nullable ProviderArgs.Builder a);
    }
    private static io.pulumi.eks.ProviderArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.eks.ProviderArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Provider(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Provider(String name) {
        this(name, ProviderArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Provider(String name, @Nullable ProviderArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Provider(String name, @Nullable ProviderArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("eks", name, args == null ? ProviderArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

}
