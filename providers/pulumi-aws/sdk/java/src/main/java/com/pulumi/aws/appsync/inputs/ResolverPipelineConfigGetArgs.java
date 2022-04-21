// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appsync.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ResolverPipelineConfigGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final ResolverPipelineConfigGetArgs Empty = new ResolverPipelineConfigGetArgs();

    /**
     * The list of Function ID.
     * 
     */
    @Import(name="functions")
    private @Nullable Output<List<String>> functions;

    public Optional<Output<List<String>>> functions() {
        return Optional.ofNullable(this.functions);
    }

    private ResolverPipelineConfigGetArgs() {}

    private ResolverPipelineConfigGetArgs(ResolverPipelineConfigGetArgs $) {
        this.functions = $.functions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResolverPipelineConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResolverPipelineConfigGetArgs $;

        public Builder() {
            $ = new ResolverPipelineConfigGetArgs();
        }

        public Builder(ResolverPipelineConfigGetArgs defaults) {
            $ = new ResolverPipelineConfigGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder functions(@Nullable Output<List<String>> functions) {
            $.functions = functions;
            return this;
        }

        public Builder functions(List<String> functions) {
            return functions(Output.of(functions));
        }

        public Builder functions(String... functions) {
            return functions(List.of(functions));
        }

        public ResolverPipelineConfigGetArgs build() {
            return $;
        }
    }

}
