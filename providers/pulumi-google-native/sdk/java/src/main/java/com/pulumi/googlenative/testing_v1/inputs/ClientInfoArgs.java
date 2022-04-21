// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.testing_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.testing_v1.inputs.ClientInfoDetailArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Information about the client which invoked the test.
 * 
 */
public final class ClientInfoArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClientInfoArgs Empty = new ClientInfoArgs();

    /**
     * The list of detailed information about client.
     * 
     */
    @Import(name="clientInfoDetails")
    private @Nullable Output<List<ClientInfoDetailArgs>> clientInfoDetails;

    public Optional<Output<List<ClientInfoDetailArgs>>> clientInfoDetails() {
        return Optional.ofNullable(this.clientInfoDetails);
    }

    /**
     * Client name, such as gcloud.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    private ClientInfoArgs() {}

    private ClientInfoArgs(ClientInfoArgs $) {
        this.clientInfoDetails = $.clientInfoDetails;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClientInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClientInfoArgs $;

        public Builder() {
            $ = new ClientInfoArgs();
        }

        public Builder(ClientInfoArgs defaults) {
            $ = new ClientInfoArgs(Objects.requireNonNull(defaults));
        }

        public Builder clientInfoDetails(@Nullable Output<List<ClientInfoDetailArgs>> clientInfoDetails) {
            $.clientInfoDetails = clientInfoDetails;
            return this;
        }

        public Builder clientInfoDetails(List<ClientInfoDetailArgs> clientInfoDetails) {
            return clientInfoDetails(Output.of(clientInfoDetails));
        }

        public Builder clientInfoDetails(ClientInfoDetailArgs... clientInfoDetails) {
            return clientInfoDetails(List.of(clientInfoDetails));
        }

        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public ClientInfoArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
