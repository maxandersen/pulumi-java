// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices.inputs;

import com.pulumi.azurenative.machinelearningservices.inputs.VirtualMachineSshCredentialsResponse;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class HDInsightResponseProperties extends com.pulumi.resources.InvokeArgs {

    public static final HDInsightResponseProperties Empty = new HDInsightResponseProperties();

    /**
     * Public IP address of the master node of the cluster.
     * 
     */
    @Import(name="address")
    private @Nullable String address;

    public Optional<String> address() {
        return Optional.ofNullable(this.address);
    }

    /**
     * Admin credentials for master node of the cluster
     * 
     */
    @Import(name="administratorAccount")
    private @Nullable VirtualMachineSshCredentialsResponse administratorAccount;

    public Optional<VirtualMachineSshCredentialsResponse> administratorAccount() {
        return Optional.ofNullable(this.administratorAccount);
    }

    /**
     * Port open for ssh connections on the master node of the cluster.
     * 
     */
    @Import(name="sshPort")
    private @Nullable Integer sshPort;

    public Optional<Integer> sshPort() {
        return Optional.ofNullable(this.sshPort);
    }

    private HDInsightResponseProperties() {}

    private HDInsightResponseProperties(HDInsightResponseProperties $) {
        this.address = $.address;
        this.administratorAccount = $.administratorAccount;
        this.sshPort = $.sshPort;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HDInsightResponseProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HDInsightResponseProperties $;

        public Builder() {
            $ = new HDInsightResponseProperties();
        }

        public Builder(HDInsightResponseProperties defaults) {
            $ = new HDInsightResponseProperties(Objects.requireNonNull(defaults));
        }

        public Builder address(@Nullable String address) {
            $.address = address;
            return this;
        }

        public Builder administratorAccount(@Nullable VirtualMachineSshCredentialsResponse administratorAccount) {
            $.administratorAccount = administratorAccount;
            return this;
        }

        public Builder sshPort(@Nullable Integer sshPort) {
            $.sshPort = sshPort;
            return this;
        }

        public HDInsightResponseProperties build() {
            return $;
        }
    }

}
