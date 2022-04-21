// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storagecache.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A namespace junction.
 * 
 */
public final class NamespaceJunctionArgs extends com.pulumi.resources.ResourceArgs {

    public static final NamespaceJunctionArgs Empty = new NamespaceJunctionArgs();

    /**
     * Namespace path on a Cache for a Storage Target.
     * 
     */
    @Import(name="namespacePath")
    private @Nullable Output<String> namespacePath;

    public Optional<Output<String>> namespacePath() {
        return Optional.ofNullable(this.namespacePath);
    }

    /**
     * Name of the access policy applied to this junction.
     * 
     */
    @Import(name="nfsAccessPolicy")
    private @Nullable Output<String> nfsAccessPolicy;

    public Optional<Output<String>> nfsAccessPolicy() {
        return Optional.ofNullable(this.nfsAccessPolicy);
    }

    /**
     * NFS export where targetPath exists.
     * 
     */
    @Import(name="nfsExport")
    private @Nullable Output<String> nfsExport;

    public Optional<Output<String>> nfsExport() {
        return Optional.ofNullable(this.nfsExport);
    }

    /**
     * Path in Storage Target to which namespacePath points.
     * 
     */
    @Import(name="targetPath")
    private @Nullable Output<String> targetPath;

    public Optional<Output<String>> targetPath() {
        return Optional.ofNullable(this.targetPath);
    }

    private NamespaceJunctionArgs() {}

    private NamespaceJunctionArgs(NamespaceJunctionArgs $) {
        this.namespacePath = $.namespacePath;
        this.nfsAccessPolicy = $.nfsAccessPolicy;
        this.nfsExport = $.nfsExport;
        this.targetPath = $.targetPath;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NamespaceJunctionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NamespaceJunctionArgs $;

        public Builder() {
            $ = new NamespaceJunctionArgs();
        }

        public Builder(NamespaceJunctionArgs defaults) {
            $ = new NamespaceJunctionArgs(Objects.requireNonNull(defaults));
        }

        public Builder namespacePath(@Nullable Output<String> namespacePath) {
            $.namespacePath = namespacePath;
            return this;
        }

        public Builder namespacePath(String namespacePath) {
            return namespacePath(Output.of(namespacePath));
        }

        public Builder nfsAccessPolicy(@Nullable Output<String> nfsAccessPolicy) {
            $.nfsAccessPolicy = nfsAccessPolicy;
            return this;
        }

        public Builder nfsAccessPolicy(String nfsAccessPolicy) {
            return nfsAccessPolicy(Output.of(nfsAccessPolicy));
        }

        public Builder nfsExport(@Nullable Output<String> nfsExport) {
            $.nfsExport = nfsExport;
            return this;
        }

        public Builder nfsExport(String nfsExport) {
            return nfsExport(Output.of(nfsExport));
        }

        public Builder targetPath(@Nullable Output<String> targetPath) {
            $.targetPath = targetPath;
            return this;
        }

        public Builder targetPath(String targetPath) {
            return targetPath(Output.of(targetPath));
        }

        public NamespaceJunctionArgs build() {
            $.nfsAccessPolicy = Codegen.stringProp("nfsAccessPolicy").output().arg($.nfsAccessPolicy).def("default").getNullable();
            return $;
        }
    }

}
