// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute_beta.enums.PublicAdvertisedPrefixStatus;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PublicAdvertisedPrefixArgs extends com.pulumi.resources.ResourceArgs {

    public static final PublicAdvertisedPrefixArgs Empty = new PublicAdvertisedPrefixArgs();

    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The IPv4 address to be used for reverse DNS verification.
     * 
     */
    @Import(name="dnsVerificationIp")
    private @Nullable Output<String> dnsVerificationIp;

    public Optional<Output<String>> dnsVerificationIp() {
        return Optional.ofNullable(this.dnsVerificationIp);
    }

    /**
     * The IPv4 address range, in CIDR format, represented by this public advertised prefix.
     * 
     */
    @Import(name="ipCidrRange")
    private @Nullable Output<String> ipCidrRange;

    public Optional<Output<String>> ipCidrRange() {
        return Optional.ofNullable(this.ipCidrRange);
    }

    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="requestId")
    private @Nullable Output<String> requestId;

    public Optional<Output<String>> requestId() {
        return Optional.ofNullable(this.requestId);
    }

    /**
     * The status of the public advertised prefix. Possible values include: - `INITIAL`: RPKI validation is complete. - `PTR_CONFIGURED`: User has configured the PTR. - `VALIDATED`: Reverse DNS lookup is successful. - `REVERSE_DNS_LOOKUP_FAILED`: Reverse DNS lookup failed. - `PREFIX_CONFIGURATION_IN_PROGRESS`: The prefix is being configured. - `PREFIX_CONFIGURATION_COMPLETE`: The prefix is fully configured. - `PREFIX_REMOVAL_IN_PROGRESS`: The prefix is being removed.
     * 
     */
    @Import(name="status")
    private @Nullable Output<PublicAdvertisedPrefixStatus> status;

    public Optional<Output<PublicAdvertisedPrefixStatus>> status() {
        return Optional.ofNullable(this.status);
    }

    private PublicAdvertisedPrefixArgs() {}

    private PublicAdvertisedPrefixArgs(PublicAdvertisedPrefixArgs $) {
        this.description = $.description;
        this.dnsVerificationIp = $.dnsVerificationIp;
        this.ipCidrRange = $.ipCidrRange;
        this.name = $.name;
        this.project = $.project;
        this.requestId = $.requestId;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PublicAdvertisedPrefixArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PublicAdvertisedPrefixArgs $;

        public Builder() {
            $ = new PublicAdvertisedPrefixArgs();
        }

        public Builder(PublicAdvertisedPrefixArgs defaults) {
            $ = new PublicAdvertisedPrefixArgs(Objects.requireNonNull(defaults));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder dnsVerificationIp(@Nullable Output<String> dnsVerificationIp) {
            $.dnsVerificationIp = dnsVerificationIp;
            return this;
        }

        public Builder dnsVerificationIp(String dnsVerificationIp) {
            return dnsVerificationIp(Output.of(dnsVerificationIp));
        }

        public Builder ipCidrRange(@Nullable Output<String> ipCidrRange) {
            $.ipCidrRange = ipCidrRange;
            return this;
        }

        public Builder ipCidrRange(String ipCidrRange) {
            return ipCidrRange(Output.of(ipCidrRange));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder requestId(@Nullable Output<String> requestId) {
            $.requestId = requestId;
            return this;
        }

        public Builder requestId(String requestId) {
            return requestId(Output.of(requestId));
        }

        public Builder status(@Nullable Output<PublicAdvertisedPrefixStatus> status) {
            $.status = status;
            return this;
        }

        public Builder status(PublicAdvertisedPrefixStatus status) {
            return status(Output.of(status));
        }

        public PublicAdvertisedPrefixArgs build() {
            return $;
        }
    }

}
