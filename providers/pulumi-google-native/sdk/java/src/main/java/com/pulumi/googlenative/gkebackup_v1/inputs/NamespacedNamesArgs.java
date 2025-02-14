// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.gkebackup_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.gkebackup_v1.inputs.NamespacedNameArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A list of namespaced Kubernetes resources.
 * 
 */
public final class NamespacedNamesArgs extends com.pulumi.resources.ResourceArgs {

    public static final NamespacedNamesArgs Empty = new NamespacedNamesArgs();

    /**
     * A list of namespaced Kubernetes resources.
     * 
     */
    @Import(name="namespacedNames")
    private @Nullable Output<List<NamespacedNameArgs>> namespacedNames;

    /**
     * @return A list of namespaced Kubernetes resources.
     * 
     */
    public Optional<Output<List<NamespacedNameArgs>>> namespacedNames() {
        return Optional.ofNullable(this.namespacedNames);
    }

    private NamespacedNamesArgs() {}

    private NamespacedNamesArgs(NamespacedNamesArgs $) {
        this.namespacedNames = $.namespacedNames;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NamespacedNamesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NamespacedNamesArgs $;

        public Builder() {
            $ = new NamespacedNamesArgs();
        }

        public Builder(NamespacedNamesArgs defaults) {
            $ = new NamespacedNamesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param namespacedNames A list of namespaced Kubernetes resources.
         * 
         * @return builder
         * 
         */
        public Builder namespacedNames(@Nullable Output<List<NamespacedNameArgs>> namespacedNames) {
            $.namespacedNames = namespacedNames;
            return this;
        }

        /**
         * @param namespacedNames A list of namespaced Kubernetes resources.
         * 
         * @return builder
         * 
         */
        public Builder namespacedNames(List<NamespacedNameArgs> namespacedNames) {
            return namespacedNames(Output.of(namespacedNames));
        }

        /**
         * @param namespacedNames A list of namespaced Kubernetes resources.
         * 
         * @return builder
         * 
         */
        public Builder namespacedNames(NamespacedNameArgs... namespacedNames) {
            return namespacedNames(List.of(namespacedNames));
        }

        public NamespacedNamesArgs build() {
            return $;
        }
    }

}
