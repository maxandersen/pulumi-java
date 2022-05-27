// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VirtualNetworkGatewayConnectionIpsecPolicy {
    /**
     * @return The DH group used in IKE phase 1 for initial SA. Valid
     * options are `DHGroup1`, `DHGroup14`, `DHGroup2`, `DHGroup2048`, `DHGroup24`,
     * `ECP256`, `ECP384`, or `None`.
     * 
     */
    private final String dhGroup;
    /**
     * @return The IKE encryption algorithm. Valid
     * options are `AES128`, `AES192`, `AES256`, `DES`, `DES3`, `GCMAES128`, or `GCMAES256`.
     * 
     */
    private final String ikeEncryption;
    /**
     * @return The IKE integrity algorithm. Valid
     * options are `GCMAES128`, `GCMAES256`, `MD5`, `SHA1`, `SHA256`, or `SHA384`.
     * 
     */
    private final String ikeIntegrity;
    /**
     * @return The IPSec encryption algorithm. Valid
     * options are `AES128`, `AES192`, `AES256`, `DES`, `DES3`, `GCMAES128`, `GCMAES192`, `GCMAES256`, or `None`.
     * 
     */
    private final String ipsecEncryption;
    /**
     * @return The IPSec integrity algorithm. Valid
     * options are `GCMAES128`, `GCMAES192`, `GCMAES256`, `MD5`, `SHA1`, or `SHA256`.
     * 
     */
    private final String ipsecIntegrity;
    /**
     * @return The DH group used in IKE phase 2 for new child SA.
     * Valid options are `ECP256`, `ECP384`, `PFS1`, `PFS14`, `PFS2`, `PFS2048`, `PFS24`, `PFSMM`,
     * or `None`.
     * 
     */
    private final String pfsGroup;
    /**
     * @return The IPSec SA payload size in KB. Must be at least
     * `1024` KB. Defaults to `102400000` KB.
     * 
     */
    private final @Nullable Integer saDatasize;
    /**
     * @return The IPSec SA lifetime in seconds. Must be at least
     * `300` seconds. Defaults to `27000` seconds.
     * 
     */
    private final @Nullable Integer saLifetime;

    @CustomType.Constructor
    private VirtualNetworkGatewayConnectionIpsecPolicy(
        @CustomType.Parameter("dhGroup") String dhGroup,
        @CustomType.Parameter("ikeEncryption") String ikeEncryption,
        @CustomType.Parameter("ikeIntegrity") String ikeIntegrity,
        @CustomType.Parameter("ipsecEncryption") String ipsecEncryption,
        @CustomType.Parameter("ipsecIntegrity") String ipsecIntegrity,
        @CustomType.Parameter("pfsGroup") String pfsGroup,
        @CustomType.Parameter("saDatasize") @Nullable Integer saDatasize,
        @CustomType.Parameter("saLifetime") @Nullable Integer saLifetime) {
        this.dhGroup = dhGroup;
        this.ikeEncryption = ikeEncryption;
        this.ikeIntegrity = ikeIntegrity;
        this.ipsecEncryption = ipsecEncryption;
        this.ipsecIntegrity = ipsecIntegrity;
        this.pfsGroup = pfsGroup;
        this.saDatasize = saDatasize;
        this.saLifetime = saLifetime;
    }

    /**
     * @return The DH group used in IKE phase 1 for initial SA. Valid
     * options are `DHGroup1`, `DHGroup14`, `DHGroup2`, `DHGroup2048`, `DHGroup24`,
     * `ECP256`, `ECP384`, or `None`.
     * 
     */
    public String dhGroup() {
        return this.dhGroup;
    }
    /**
     * @return The IKE encryption algorithm. Valid
     * options are `AES128`, `AES192`, `AES256`, `DES`, `DES3`, `GCMAES128`, or `GCMAES256`.
     * 
     */
    public String ikeEncryption() {
        return this.ikeEncryption;
    }
    /**
     * @return The IKE integrity algorithm. Valid
     * options are `GCMAES128`, `GCMAES256`, `MD5`, `SHA1`, `SHA256`, or `SHA384`.
     * 
     */
    public String ikeIntegrity() {
        return this.ikeIntegrity;
    }
    /**
     * @return The IPSec encryption algorithm. Valid
     * options are `AES128`, `AES192`, `AES256`, `DES`, `DES3`, `GCMAES128`, `GCMAES192`, `GCMAES256`, or `None`.
     * 
     */
    public String ipsecEncryption() {
        return this.ipsecEncryption;
    }
    /**
     * @return The IPSec integrity algorithm. Valid
     * options are `GCMAES128`, `GCMAES192`, `GCMAES256`, `MD5`, `SHA1`, or `SHA256`.
     * 
     */
    public String ipsecIntegrity() {
        return this.ipsecIntegrity;
    }
    /**
     * @return The DH group used in IKE phase 2 for new child SA.
     * Valid options are `ECP256`, `ECP384`, `PFS1`, `PFS14`, `PFS2`, `PFS2048`, `PFS24`, `PFSMM`,
     * or `None`.
     * 
     */
    public String pfsGroup() {
        return this.pfsGroup;
    }
    /**
     * @return The IPSec SA payload size in KB. Must be at least
     * `1024` KB. Defaults to `102400000` KB.
     * 
     */
    public Optional<Integer> saDatasize() {
        return Optional.ofNullable(this.saDatasize);
    }
    /**
     * @return The IPSec SA lifetime in seconds. Must be at least
     * `300` seconds. Defaults to `27000` seconds.
     * 
     */
    public Optional<Integer> saLifetime() {
        return Optional.ofNullable(this.saLifetime);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNetworkGatewayConnectionIpsecPolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String dhGroup;
        private String ikeEncryption;
        private String ikeIntegrity;
        private String ipsecEncryption;
        private String ipsecIntegrity;
        private String pfsGroup;
        private @Nullable Integer saDatasize;
        private @Nullable Integer saLifetime;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNetworkGatewayConnectionIpsecPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dhGroup = defaults.dhGroup;
    	      this.ikeEncryption = defaults.ikeEncryption;
    	      this.ikeIntegrity = defaults.ikeIntegrity;
    	      this.ipsecEncryption = defaults.ipsecEncryption;
    	      this.ipsecIntegrity = defaults.ipsecIntegrity;
    	      this.pfsGroup = defaults.pfsGroup;
    	      this.saDatasize = defaults.saDatasize;
    	      this.saLifetime = defaults.saLifetime;
        }

        public Builder dhGroup(String dhGroup) {
            this.dhGroup = Objects.requireNonNull(dhGroup);
            return this;
        }
        public Builder ikeEncryption(String ikeEncryption) {
            this.ikeEncryption = Objects.requireNonNull(ikeEncryption);
            return this;
        }
        public Builder ikeIntegrity(String ikeIntegrity) {
            this.ikeIntegrity = Objects.requireNonNull(ikeIntegrity);
            return this;
        }
        public Builder ipsecEncryption(String ipsecEncryption) {
            this.ipsecEncryption = Objects.requireNonNull(ipsecEncryption);
            return this;
        }
        public Builder ipsecIntegrity(String ipsecIntegrity) {
            this.ipsecIntegrity = Objects.requireNonNull(ipsecIntegrity);
            return this;
        }
        public Builder pfsGroup(String pfsGroup) {
            this.pfsGroup = Objects.requireNonNull(pfsGroup);
            return this;
        }
        public Builder saDatasize(@Nullable Integer saDatasize) {
            this.saDatasize = saDatasize;
            return this;
        }
        public Builder saLifetime(@Nullable Integer saLifetime) {
            this.saLifetime = saLifetime;
            return this;
        }        public VirtualNetworkGatewayConnectionIpsecPolicy build() {
            return new VirtualNetworkGatewayConnectionIpsecPolicy(dhGroup, ikeEncryption, ikeIntegrity, ipsecEncryption, ipsecIntegrity, pfsGroup, saDatasize, saLifetime);
        }
    }
}
