// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.sqladmin_v1beta4.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.sqladmin_v1beta4.enums.IpMappingType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Database instance IP Mapping.
 * 
 */
public final class IpMappingArgs extends com.pulumi.resources.ResourceArgs {

    public static final IpMappingArgs Empty = new IpMappingArgs();

    /**
     * The IP address assigned.
     * 
     */
    @Import(name="ipAddress")
    private @Nullable Output<String> ipAddress;

    /**
     * @return The IP address assigned.
     * 
     */
    public Optional<Output<String>> ipAddress() {
        return Optional.ofNullable(this.ipAddress);
    }

    /**
     * The due time for this IP to be retired in [RFC 3339](https://tools.ietf.org/html/rfc3339) format, for example `2012-11-15T16:19:00.094Z`. This field is only available when the IP is scheduled to be retired.
     * 
     */
    @Import(name="timeToRetire")
    private @Nullable Output<String> timeToRetire;

    /**
     * @return The due time for this IP to be retired in [RFC 3339](https://tools.ietf.org/html/rfc3339) format, for example `2012-11-15T16:19:00.094Z`. This field is only available when the IP is scheduled to be retired.
     * 
     */
    public Optional<Output<String>> timeToRetire() {
        return Optional.ofNullable(this.timeToRetire);
    }

    /**
     * The type of this IP address. A `PRIMARY` address is a public address that can accept incoming connections. A `PRIVATE` address is a private address that can accept incoming connections. An `OUTGOING` address is the source address of connections originating from the instance, if supported.
     * 
     */
    @Import(name="type")
    private @Nullable Output<IpMappingType> type;

    /**
     * @return The type of this IP address. A `PRIMARY` address is a public address that can accept incoming connections. A `PRIVATE` address is a private address that can accept incoming connections. An `OUTGOING` address is the source address of connections originating from the instance, if supported.
     * 
     */
    public Optional<Output<IpMappingType>> type() {
        return Optional.ofNullable(this.type);
    }

    private IpMappingArgs() {}

    private IpMappingArgs(IpMappingArgs $) {
        this.ipAddress = $.ipAddress;
        this.timeToRetire = $.timeToRetire;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IpMappingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IpMappingArgs $;

        public Builder() {
            $ = new IpMappingArgs();
        }

        public Builder(IpMappingArgs defaults) {
            $ = new IpMappingArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ipAddress The IP address assigned.
         * 
         * @return builder
         * 
         */
        public Builder ipAddress(@Nullable Output<String> ipAddress) {
            $.ipAddress = ipAddress;
            return this;
        }

        /**
         * @param ipAddress The IP address assigned.
         * 
         * @return builder
         * 
         */
        public Builder ipAddress(String ipAddress) {
            return ipAddress(Output.of(ipAddress));
        }

        /**
         * @param timeToRetire The due time for this IP to be retired in [RFC 3339](https://tools.ietf.org/html/rfc3339) format, for example `2012-11-15T16:19:00.094Z`. This field is only available when the IP is scheduled to be retired.
         * 
         * @return builder
         * 
         */
        public Builder timeToRetire(@Nullable Output<String> timeToRetire) {
            $.timeToRetire = timeToRetire;
            return this;
        }

        /**
         * @param timeToRetire The due time for this IP to be retired in [RFC 3339](https://tools.ietf.org/html/rfc3339) format, for example `2012-11-15T16:19:00.094Z`. This field is only available when the IP is scheduled to be retired.
         * 
         * @return builder
         * 
         */
        public Builder timeToRetire(String timeToRetire) {
            return timeToRetire(Output.of(timeToRetire));
        }

        /**
         * @param type The type of this IP address. A `PRIMARY` address is a public address that can accept incoming connections. A `PRIVATE` address is a private address that can accept incoming connections. An `OUTGOING` address is the source address of connections originating from the instance, if supported.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<IpMappingType> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of this IP address. A `PRIMARY` address is a public address that can accept incoming connections. A `PRIVATE` address is a private address that can accept incoming connections. An `OUTGOING` address is the source address of connections originating from the instance, if supported.
         * 
         * @return builder
         * 
         */
        public Builder type(IpMappingType type) {
            return type(Output.of(type));
        }

        public IpMappingArgs build() {
            return $;
        }
    }

}
