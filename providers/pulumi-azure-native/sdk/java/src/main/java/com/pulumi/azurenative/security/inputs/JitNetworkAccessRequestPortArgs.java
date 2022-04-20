// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.security.inputs;

import com.pulumi.azurenative.security.enums.Status;
import com.pulumi.azurenative.security.enums.StatusReason;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class JitNetworkAccessRequestPortArgs extends com.pulumi.resources.ResourceArgs {

    public static final JitNetworkAccessRequestPortArgs Empty = new JitNetworkAccessRequestPortArgs();

    /**
     * Mutually exclusive with the &#34;allowedSourceAddressPrefixes&#34; parameter. Should be an IP address or CIDR, for example &#34;192.168.0.3&#34; or &#34;192.168.0.0/16&#34;.
     * 
     */
    @Import(name="allowedSourceAddressPrefix")
      private final @Nullable Output<String> allowedSourceAddressPrefix;

    public Output<String> allowedSourceAddressPrefix() {
        return this.allowedSourceAddressPrefix == null ? Codegen.empty() : this.allowedSourceAddressPrefix;
    }

    /**
     * Mutually exclusive with the &#34;allowedSourceAddressPrefix&#34; parameter.
     * 
     */
    @Import(name="allowedSourceAddressPrefixes")
      private final @Nullable Output<List<String>> allowedSourceAddressPrefixes;

    public Output<List<String>> allowedSourceAddressPrefixes() {
        return this.allowedSourceAddressPrefixes == null ? Codegen.empty() : this.allowedSourceAddressPrefixes;
    }

    /**
     * The date &amp; time at which the request ends in UTC
     * 
     */
    @Import(name="endTimeUtc", required=true)
      private final Output<String> endTimeUtc;

    public Output<String> endTimeUtc() {
        return this.endTimeUtc;
    }

    /**
     * The port which is mapped to this port&#39;s `number` in the Azure Firewall, if applicable
     * 
     */
    @Import(name="mappedPort")
      private final @Nullable Output<Integer> mappedPort;

    public Output<Integer> mappedPort() {
        return this.mappedPort == null ? Codegen.empty() : this.mappedPort;
    }

    @Import(name="number", required=true)
      private final Output<Integer> number;

    public Output<Integer> number() {
        return this.number;
    }

    /**
     * The status of the port
     * 
     */
    @Import(name="status", required=true)
      private final Output<Either<String,Status>> status;

    public Output<Either<String,Status>> status() {
        return this.status;
    }

    /**
     * A description of why the `status` has its value
     * 
     */
    @Import(name="statusReason", required=true)
      private final Output<Either<String,StatusReason>> statusReason;

    public Output<Either<String,StatusReason>> statusReason() {
        return this.statusReason;
    }

    public JitNetworkAccessRequestPortArgs(
        @Nullable Output<String> allowedSourceAddressPrefix,
        @Nullable Output<List<String>> allowedSourceAddressPrefixes,
        Output<String> endTimeUtc,
        @Nullable Output<Integer> mappedPort,
        Output<Integer> number,
        Output<Either<String,Status>> status,
        Output<Either<String,StatusReason>> statusReason) {
        this.allowedSourceAddressPrefix = allowedSourceAddressPrefix;
        this.allowedSourceAddressPrefixes = allowedSourceAddressPrefixes;
        this.endTimeUtc = Objects.requireNonNull(endTimeUtc, "expected parameter 'endTimeUtc' to be non-null");
        this.mappedPort = mappedPort;
        this.number = Objects.requireNonNull(number, "expected parameter 'number' to be non-null");
        this.status = Objects.requireNonNull(status, "expected parameter 'status' to be non-null");
        this.statusReason = Objects.requireNonNull(statusReason, "expected parameter 'statusReason' to be non-null");
    }

    private JitNetworkAccessRequestPortArgs() {
        this.allowedSourceAddressPrefix = Codegen.empty();
        this.allowedSourceAddressPrefixes = Codegen.empty();
        this.endTimeUtc = Codegen.empty();
        this.mappedPort = Codegen.empty();
        this.number = Codegen.empty();
        this.status = Codegen.empty();
        this.statusReason = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JitNetworkAccessRequestPortArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> allowedSourceAddressPrefix;
        private @Nullable Output<List<String>> allowedSourceAddressPrefixes;
        private Output<String> endTimeUtc;
        private @Nullable Output<Integer> mappedPort;
        private Output<Integer> number;
        private Output<Either<String,Status>> status;
        private Output<Either<String,StatusReason>> statusReason;

        public Builder() {
    	      // Empty
        }

        public Builder(JitNetworkAccessRequestPortArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedSourceAddressPrefix = defaults.allowedSourceAddressPrefix;
    	      this.allowedSourceAddressPrefixes = defaults.allowedSourceAddressPrefixes;
    	      this.endTimeUtc = defaults.endTimeUtc;
    	      this.mappedPort = defaults.mappedPort;
    	      this.number = defaults.number;
    	      this.status = defaults.status;
    	      this.statusReason = defaults.statusReason;
        }

        public Builder allowedSourceAddressPrefix(@Nullable Output<String> allowedSourceAddressPrefix) {
            this.allowedSourceAddressPrefix = allowedSourceAddressPrefix;
            return this;
        }
        public Builder allowedSourceAddressPrefix(@Nullable String allowedSourceAddressPrefix) {
            this.allowedSourceAddressPrefix = Codegen.ofNullable(allowedSourceAddressPrefix);
            return this;
        }
        public Builder allowedSourceAddressPrefixes(@Nullable Output<List<String>> allowedSourceAddressPrefixes) {
            this.allowedSourceAddressPrefixes = allowedSourceAddressPrefixes;
            return this;
        }
        public Builder allowedSourceAddressPrefixes(@Nullable List<String> allowedSourceAddressPrefixes) {
            this.allowedSourceAddressPrefixes = Codegen.ofNullable(allowedSourceAddressPrefixes);
            return this;
        }
        public Builder allowedSourceAddressPrefixes(String... allowedSourceAddressPrefixes) {
            return allowedSourceAddressPrefixes(List.of(allowedSourceAddressPrefixes));
        }
        public Builder endTimeUtc(Output<String> endTimeUtc) {
            this.endTimeUtc = Objects.requireNonNull(endTimeUtc);
            return this;
        }
        public Builder endTimeUtc(String endTimeUtc) {
            this.endTimeUtc = Output.of(Objects.requireNonNull(endTimeUtc));
            return this;
        }
        public Builder mappedPort(@Nullable Output<Integer> mappedPort) {
            this.mappedPort = mappedPort;
            return this;
        }
        public Builder mappedPort(@Nullable Integer mappedPort) {
            this.mappedPort = Codegen.ofNullable(mappedPort);
            return this;
        }
        public Builder number(Output<Integer> number) {
            this.number = Objects.requireNonNull(number);
            return this;
        }
        public Builder number(Integer number) {
            this.number = Output.of(Objects.requireNonNull(number));
            return this;
        }
        public Builder status(Output<Either<String,Status>> status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public Builder status(Either<String,Status> status) {
            this.status = Output.of(Objects.requireNonNull(status));
            return this;
        }
        public Builder statusReason(Output<Either<String,StatusReason>> statusReason) {
            this.statusReason = Objects.requireNonNull(statusReason);
            return this;
        }
        public Builder statusReason(Either<String,StatusReason> statusReason) {
            this.statusReason = Output.of(Objects.requireNonNull(statusReason));
            return this;
        }        public JitNetworkAccessRequestPortArgs build() {
            return new JitNetworkAccessRequestPortArgs(allowedSourceAddressPrefix, allowedSourceAddressPrefixes, endTimeUtc, mappedPort, number, status, statusReason);
        }
    }
}
