// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabric.inputs;

import io.pulumi.azurenative.servicefabric.inputs.ServerCertificateCommonNameArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Describes a list of server certificates referenced by common name that are used to secure the cluster.
 * 
 */
public final class ServerCertificateCommonNamesArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServerCertificateCommonNamesArgs Empty = new ServerCertificateCommonNamesArgs();

    /**
     * The list of server certificates referenced by common name that are used to secure the cluster.
     * 
     */
    @Import(name="commonNames")
      private final @Nullable Output<List<ServerCertificateCommonNameArgs>> commonNames;

    public Output<List<ServerCertificateCommonNameArgs>> commonNames() {
        return this.commonNames == null ? Codegen.empty() : this.commonNames;
    }

    /**
     * The local certificate store location.
     * 
     */
    @Import(name="x509StoreName")
      private final @Nullable Output<String> x509StoreName;

    public Output<String> x509StoreName() {
        return this.x509StoreName == null ? Codegen.empty() : this.x509StoreName;
    }

    public ServerCertificateCommonNamesArgs(
        @Nullable Output<List<ServerCertificateCommonNameArgs>> commonNames,
        @Nullable Output<String> x509StoreName) {
        this.commonNames = commonNames;
        this.x509StoreName = x509StoreName;
    }

    private ServerCertificateCommonNamesArgs() {
        this.commonNames = Codegen.empty();
        this.x509StoreName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServerCertificateCommonNamesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<ServerCertificateCommonNameArgs>> commonNames;
        private @Nullable Output<String> x509StoreName;

        public Builder() {
    	      // Empty
        }

        public Builder(ServerCertificateCommonNamesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.commonNames = defaults.commonNames;
    	      this.x509StoreName = defaults.x509StoreName;
        }

        public Builder commonNames(@Nullable Output<List<ServerCertificateCommonNameArgs>> commonNames) {
            this.commonNames = commonNames;
            return this;
        }
        public Builder commonNames(@Nullable List<ServerCertificateCommonNameArgs> commonNames) {
            this.commonNames = Codegen.ofNullable(commonNames);
            return this;
        }
        public Builder commonNames(ServerCertificateCommonNameArgs... commonNames) {
            return commonNames(List.of(commonNames));
        }
        public Builder x509StoreName(@Nullable Output<String> x509StoreName) {
            this.x509StoreName = x509StoreName;
            return this;
        }
        public Builder x509StoreName(@Nullable String x509StoreName) {
            this.x509StoreName = Codegen.ofNullable(x509StoreName);
            return this;
        }        public ServerCertificateCommonNamesArgs build() {
            return new ServerCertificateCommonNamesArgs(commonNames, x509StoreName);
        }
    }
}
