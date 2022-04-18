// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerservice.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Sysctl settings for Linux agent nodes.
 * 
 */
public final class SysctlConfigResponse extends com.pulumi.resources.InvokeArgs {

    public static final SysctlConfigResponse Empty = new SysctlConfigResponse();

    /**
     * Sysctl setting fs.aio-max-nr.
     * 
     */
    @Import(name="fsAioMaxNr")
      private final @Nullable Integer fsAioMaxNr;

    public Optional<Integer> fsAioMaxNr() {
        return this.fsAioMaxNr == null ? Optional.empty() : Optional.ofNullable(this.fsAioMaxNr);
    }

    /**
     * Sysctl setting fs.file-max.
     * 
     */
    @Import(name="fsFileMax")
      private final @Nullable Integer fsFileMax;

    public Optional<Integer> fsFileMax() {
        return this.fsFileMax == null ? Optional.empty() : Optional.ofNullable(this.fsFileMax);
    }

    /**
     * Sysctl setting fs.inotify.max_user_watches.
     * 
     */
    @Import(name="fsInotifyMaxUserWatches")
      private final @Nullable Integer fsInotifyMaxUserWatches;

    public Optional<Integer> fsInotifyMaxUserWatches() {
        return this.fsInotifyMaxUserWatches == null ? Optional.empty() : Optional.ofNullable(this.fsInotifyMaxUserWatches);
    }

    /**
     * Sysctl setting fs.nr_open.
     * 
     */
    @Import(name="fsNrOpen")
      private final @Nullable Integer fsNrOpen;

    public Optional<Integer> fsNrOpen() {
        return this.fsNrOpen == null ? Optional.empty() : Optional.ofNullable(this.fsNrOpen);
    }

    /**
     * Sysctl setting kernel.threads-max.
     * 
     */
    @Import(name="kernelThreadsMax")
      private final @Nullable Integer kernelThreadsMax;

    public Optional<Integer> kernelThreadsMax() {
        return this.kernelThreadsMax == null ? Optional.empty() : Optional.ofNullable(this.kernelThreadsMax);
    }

    /**
     * Sysctl setting net.core.netdev_max_backlog.
     * 
     */
    @Import(name="netCoreNetdevMaxBacklog")
      private final @Nullable Integer netCoreNetdevMaxBacklog;

    public Optional<Integer> netCoreNetdevMaxBacklog() {
        return this.netCoreNetdevMaxBacklog == null ? Optional.empty() : Optional.ofNullable(this.netCoreNetdevMaxBacklog);
    }

    /**
     * Sysctl setting net.core.optmem_max.
     * 
     */
    @Import(name="netCoreOptmemMax")
      private final @Nullable Integer netCoreOptmemMax;

    public Optional<Integer> netCoreOptmemMax() {
        return this.netCoreOptmemMax == null ? Optional.empty() : Optional.ofNullable(this.netCoreOptmemMax);
    }

    /**
     * Sysctl setting net.core.rmem_default.
     * 
     */
    @Import(name="netCoreRmemDefault")
      private final @Nullable Integer netCoreRmemDefault;

    public Optional<Integer> netCoreRmemDefault() {
        return this.netCoreRmemDefault == null ? Optional.empty() : Optional.ofNullable(this.netCoreRmemDefault);
    }

    /**
     * Sysctl setting net.core.rmem_max.
     * 
     */
    @Import(name="netCoreRmemMax")
      private final @Nullable Integer netCoreRmemMax;

    public Optional<Integer> netCoreRmemMax() {
        return this.netCoreRmemMax == null ? Optional.empty() : Optional.ofNullable(this.netCoreRmemMax);
    }

    /**
     * Sysctl setting net.core.somaxconn.
     * 
     */
    @Import(name="netCoreSomaxconn")
      private final @Nullable Integer netCoreSomaxconn;

    public Optional<Integer> netCoreSomaxconn() {
        return this.netCoreSomaxconn == null ? Optional.empty() : Optional.ofNullable(this.netCoreSomaxconn);
    }

    /**
     * Sysctl setting net.core.wmem_default.
     * 
     */
    @Import(name="netCoreWmemDefault")
      private final @Nullable Integer netCoreWmemDefault;

    public Optional<Integer> netCoreWmemDefault() {
        return this.netCoreWmemDefault == null ? Optional.empty() : Optional.ofNullable(this.netCoreWmemDefault);
    }

    /**
     * Sysctl setting net.core.wmem_max.
     * 
     */
    @Import(name="netCoreWmemMax")
      private final @Nullable Integer netCoreWmemMax;

    public Optional<Integer> netCoreWmemMax() {
        return this.netCoreWmemMax == null ? Optional.empty() : Optional.ofNullable(this.netCoreWmemMax);
    }

    /**
     * Sysctl setting net.ipv4.ip_local_port_range.
     * 
     */
    @Import(name="netIpv4IpLocalPortRange")
      private final @Nullable String netIpv4IpLocalPortRange;

    public Optional<String> netIpv4IpLocalPortRange() {
        return this.netIpv4IpLocalPortRange == null ? Optional.empty() : Optional.ofNullable(this.netIpv4IpLocalPortRange);
    }

    /**
     * Sysctl setting net.ipv4.neigh.default.gc_thresh1.
     * 
     */
    @Import(name="netIpv4NeighDefaultGcThresh1")
      private final @Nullable Integer netIpv4NeighDefaultGcThresh1;

    public Optional<Integer> netIpv4NeighDefaultGcThresh1() {
        return this.netIpv4NeighDefaultGcThresh1 == null ? Optional.empty() : Optional.ofNullable(this.netIpv4NeighDefaultGcThresh1);
    }

    /**
     * Sysctl setting net.ipv4.neigh.default.gc_thresh2.
     * 
     */
    @Import(name="netIpv4NeighDefaultGcThresh2")
      private final @Nullable Integer netIpv4NeighDefaultGcThresh2;

    public Optional<Integer> netIpv4NeighDefaultGcThresh2() {
        return this.netIpv4NeighDefaultGcThresh2 == null ? Optional.empty() : Optional.ofNullable(this.netIpv4NeighDefaultGcThresh2);
    }

    /**
     * Sysctl setting net.ipv4.neigh.default.gc_thresh3.
     * 
     */
    @Import(name="netIpv4NeighDefaultGcThresh3")
      private final @Nullable Integer netIpv4NeighDefaultGcThresh3;

    public Optional<Integer> netIpv4NeighDefaultGcThresh3() {
        return this.netIpv4NeighDefaultGcThresh3 == null ? Optional.empty() : Optional.ofNullable(this.netIpv4NeighDefaultGcThresh3);
    }

    /**
     * Sysctl setting net.ipv4.tcp_fin_timeout.
     * 
     */
    @Import(name="netIpv4TcpFinTimeout")
      private final @Nullable Integer netIpv4TcpFinTimeout;

    public Optional<Integer> netIpv4TcpFinTimeout() {
        return this.netIpv4TcpFinTimeout == null ? Optional.empty() : Optional.ofNullable(this.netIpv4TcpFinTimeout);
    }

    /**
     * Sysctl setting net.ipv4.tcp_keepalive_probes.
     * 
     */
    @Import(name="netIpv4TcpKeepaliveProbes")
      private final @Nullable Integer netIpv4TcpKeepaliveProbes;

    public Optional<Integer> netIpv4TcpKeepaliveProbes() {
        return this.netIpv4TcpKeepaliveProbes == null ? Optional.empty() : Optional.ofNullable(this.netIpv4TcpKeepaliveProbes);
    }

    /**
     * Sysctl setting net.ipv4.tcp_keepalive_time.
     * 
     */
    @Import(name="netIpv4TcpKeepaliveTime")
      private final @Nullable Integer netIpv4TcpKeepaliveTime;

    public Optional<Integer> netIpv4TcpKeepaliveTime() {
        return this.netIpv4TcpKeepaliveTime == null ? Optional.empty() : Optional.ofNullable(this.netIpv4TcpKeepaliveTime);
    }

    /**
     * Sysctl setting net.ipv4.tcp_max_syn_backlog.
     * 
     */
    @Import(name="netIpv4TcpMaxSynBacklog")
      private final @Nullable Integer netIpv4TcpMaxSynBacklog;

    public Optional<Integer> netIpv4TcpMaxSynBacklog() {
        return this.netIpv4TcpMaxSynBacklog == null ? Optional.empty() : Optional.ofNullable(this.netIpv4TcpMaxSynBacklog);
    }

    /**
     * Sysctl setting net.ipv4.tcp_max_tw_buckets.
     * 
     */
    @Import(name="netIpv4TcpMaxTwBuckets")
      private final @Nullable Integer netIpv4TcpMaxTwBuckets;

    public Optional<Integer> netIpv4TcpMaxTwBuckets() {
        return this.netIpv4TcpMaxTwBuckets == null ? Optional.empty() : Optional.ofNullable(this.netIpv4TcpMaxTwBuckets);
    }

    /**
     * Sysctl setting net.ipv4.tcp_tw_reuse.
     * 
     */
    @Import(name="netIpv4TcpTwReuse")
      private final @Nullable Boolean netIpv4TcpTwReuse;

    public Optional<Boolean> netIpv4TcpTwReuse() {
        return this.netIpv4TcpTwReuse == null ? Optional.empty() : Optional.ofNullable(this.netIpv4TcpTwReuse);
    }

    /**
     * Sysctl setting net.ipv4.tcp_keepalive_intvl.
     * 
     */
    @Import(name="netIpv4TcpkeepaliveIntvl")
      private final @Nullable Integer netIpv4TcpkeepaliveIntvl;

    public Optional<Integer> netIpv4TcpkeepaliveIntvl() {
        return this.netIpv4TcpkeepaliveIntvl == null ? Optional.empty() : Optional.ofNullable(this.netIpv4TcpkeepaliveIntvl);
    }

    /**
     * Sysctl setting net.netfilter.nf_conntrack_buckets.
     * 
     */
    @Import(name="netNetfilterNfConntrackBuckets")
      private final @Nullable Integer netNetfilterNfConntrackBuckets;

    public Optional<Integer> netNetfilterNfConntrackBuckets() {
        return this.netNetfilterNfConntrackBuckets == null ? Optional.empty() : Optional.ofNullable(this.netNetfilterNfConntrackBuckets);
    }

    /**
     * Sysctl setting net.netfilter.nf_conntrack_max.
     * 
     */
    @Import(name="netNetfilterNfConntrackMax")
      private final @Nullable Integer netNetfilterNfConntrackMax;

    public Optional<Integer> netNetfilterNfConntrackMax() {
        return this.netNetfilterNfConntrackMax == null ? Optional.empty() : Optional.ofNullable(this.netNetfilterNfConntrackMax);
    }

    /**
     * Sysctl setting vm.max_map_count.
     * 
     */
    @Import(name="vmMaxMapCount")
      private final @Nullable Integer vmMaxMapCount;

    public Optional<Integer> vmMaxMapCount() {
        return this.vmMaxMapCount == null ? Optional.empty() : Optional.ofNullable(this.vmMaxMapCount);
    }

    /**
     * Sysctl setting vm.swappiness.
     * 
     */
    @Import(name="vmSwappiness")
      private final @Nullable Integer vmSwappiness;

    public Optional<Integer> vmSwappiness() {
        return this.vmSwappiness == null ? Optional.empty() : Optional.ofNullable(this.vmSwappiness);
    }

    /**
     * Sysctl setting vm.vfs_cache_pressure.
     * 
     */
    @Import(name="vmVfsCachePressure")
      private final @Nullable Integer vmVfsCachePressure;

    public Optional<Integer> vmVfsCachePressure() {
        return this.vmVfsCachePressure == null ? Optional.empty() : Optional.ofNullable(this.vmVfsCachePressure);
    }

    public SysctlConfigResponse(
        @Nullable Integer fsAioMaxNr,
        @Nullable Integer fsFileMax,
        @Nullable Integer fsInotifyMaxUserWatches,
        @Nullable Integer fsNrOpen,
        @Nullable Integer kernelThreadsMax,
        @Nullable Integer netCoreNetdevMaxBacklog,
        @Nullable Integer netCoreOptmemMax,
        @Nullable Integer netCoreRmemDefault,
        @Nullable Integer netCoreRmemMax,
        @Nullable Integer netCoreSomaxconn,
        @Nullable Integer netCoreWmemDefault,
        @Nullable Integer netCoreWmemMax,
        @Nullable String netIpv4IpLocalPortRange,
        @Nullable Integer netIpv4NeighDefaultGcThresh1,
        @Nullable Integer netIpv4NeighDefaultGcThresh2,
        @Nullable Integer netIpv4NeighDefaultGcThresh3,
        @Nullable Integer netIpv4TcpFinTimeout,
        @Nullable Integer netIpv4TcpKeepaliveProbes,
        @Nullable Integer netIpv4TcpKeepaliveTime,
        @Nullable Integer netIpv4TcpMaxSynBacklog,
        @Nullable Integer netIpv4TcpMaxTwBuckets,
        @Nullable Boolean netIpv4TcpTwReuse,
        @Nullable Integer netIpv4TcpkeepaliveIntvl,
        @Nullable Integer netNetfilterNfConntrackBuckets,
        @Nullable Integer netNetfilterNfConntrackMax,
        @Nullable Integer vmMaxMapCount,
        @Nullable Integer vmSwappiness,
        @Nullable Integer vmVfsCachePressure) {
        this.fsAioMaxNr = fsAioMaxNr;
        this.fsFileMax = fsFileMax;
        this.fsInotifyMaxUserWatches = fsInotifyMaxUserWatches;
        this.fsNrOpen = fsNrOpen;
        this.kernelThreadsMax = kernelThreadsMax;
        this.netCoreNetdevMaxBacklog = netCoreNetdevMaxBacklog;
        this.netCoreOptmemMax = netCoreOptmemMax;
        this.netCoreRmemDefault = netCoreRmemDefault;
        this.netCoreRmemMax = netCoreRmemMax;
        this.netCoreSomaxconn = netCoreSomaxconn;
        this.netCoreWmemDefault = netCoreWmemDefault;
        this.netCoreWmemMax = netCoreWmemMax;
        this.netIpv4IpLocalPortRange = netIpv4IpLocalPortRange;
        this.netIpv4NeighDefaultGcThresh1 = netIpv4NeighDefaultGcThresh1;
        this.netIpv4NeighDefaultGcThresh2 = netIpv4NeighDefaultGcThresh2;
        this.netIpv4NeighDefaultGcThresh3 = netIpv4NeighDefaultGcThresh3;
        this.netIpv4TcpFinTimeout = netIpv4TcpFinTimeout;
        this.netIpv4TcpKeepaliveProbes = netIpv4TcpKeepaliveProbes;
        this.netIpv4TcpKeepaliveTime = netIpv4TcpKeepaliveTime;
        this.netIpv4TcpMaxSynBacklog = netIpv4TcpMaxSynBacklog;
        this.netIpv4TcpMaxTwBuckets = netIpv4TcpMaxTwBuckets;
        this.netIpv4TcpTwReuse = netIpv4TcpTwReuse;
        this.netIpv4TcpkeepaliveIntvl = netIpv4TcpkeepaliveIntvl;
        this.netNetfilterNfConntrackBuckets = netNetfilterNfConntrackBuckets;
        this.netNetfilterNfConntrackMax = netNetfilterNfConntrackMax;
        this.vmMaxMapCount = vmMaxMapCount;
        this.vmSwappiness = vmSwappiness;
        this.vmVfsCachePressure = vmVfsCachePressure;
    }

    private SysctlConfigResponse() {
        this.fsAioMaxNr = null;
        this.fsFileMax = null;
        this.fsInotifyMaxUserWatches = null;
        this.fsNrOpen = null;
        this.kernelThreadsMax = null;
        this.netCoreNetdevMaxBacklog = null;
        this.netCoreOptmemMax = null;
        this.netCoreRmemDefault = null;
        this.netCoreRmemMax = null;
        this.netCoreSomaxconn = null;
        this.netCoreWmemDefault = null;
        this.netCoreWmemMax = null;
        this.netIpv4IpLocalPortRange = null;
        this.netIpv4NeighDefaultGcThresh1 = null;
        this.netIpv4NeighDefaultGcThresh2 = null;
        this.netIpv4NeighDefaultGcThresh3 = null;
        this.netIpv4TcpFinTimeout = null;
        this.netIpv4TcpKeepaliveProbes = null;
        this.netIpv4TcpKeepaliveTime = null;
        this.netIpv4TcpMaxSynBacklog = null;
        this.netIpv4TcpMaxTwBuckets = null;
        this.netIpv4TcpTwReuse = null;
        this.netIpv4TcpkeepaliveIntvl = null;
        this.netNetfilterNfConntrackBuckets = null;
        this.netNetfilterNfConntrackMax = null;
        this.vmMaxMapCount = null;
        this.vmSwappiness = null;
        this.vmVfsCachePressure = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SysctlConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer fsAioMaxNr;
        private @Nullable Integer fsFileMax;
        private @Nullable Integer fsInotifyMaxUserWatches;
        private @Nullable Integer fsNrOpen;
        private @Nullable Integer kernelThreadsMax;
        private @Nullable Integer netCoreNetdevMaxBacklog;
        private @Nullable Integer netCoreOptmemMax;
        private @Nullable Integer netCoreRmemDefault;
        private @Nullable Integer netCoreRmemMax;
        private @Nullable Integer netCoreSomaxconn;
        private @Nullable Integer netCoreWmemDefault;
        private @Nullable Integer netCoreWmemMax;
        private @Nullable String netIpv4IpLocalPortRange;
        private @Nullable Integer netIpv4NeighDefaultGcThresh1;
        private @Nullable Integer netIpv4NeighDefaultGcThresh2;
        private @Nullable Integer netIpv4NeighDefaultGcThresh3;
        private @Nullable Integer netIpv4TcpFinTimeout;
        private @Nullable Integer netIpv4TcpKeepaliveProbes;
        private @Nullable Integer netIpv4TcpKeepaliveTime;
        private @Nullable Integer netIpv4TcpMaxSynBacklog;
        private @Nullable Integer netIpv4TcpMaxTwBuckets;
        private @Nullable Boolean netIpv4TcpTwReuse;
        private @Nullable Integer netIpv4TcpkeepaliveIntvl;
        private @Nullable Integer netNetfilterNfConntrackBuckets;
        private @Nullable Integer netNetfilterNfConntrackMax;
        private @Nullable Integer vmMaxMapCount;
        private @Nullable Integer vmSwappiness;
        private @Nullable Integer vmVfsCachePressure;

        public Builder() {
    	      // Empty
        }

        public Builder(SysctlConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fsAioMaxNr = defaults.fsAioMaxNr;
    	      this.fsFileMax = defaults.fsFileMax;
    	      this.fsInotifyMaxUserWatches = defaults.fsInotifyMaxUserWatches;
    	      this.fsNrOpen = defaults.fsNrOpen;
    	      this.kernelThreadsMax = defaults.kernelThreadsMax;
    	      this.netCoreNetdevMaxBacklog = defaults.netCoreNetdevMaxBacklog;
    	      this.netCoreOptmemMax = defaults.netCoreOptmemMax;
    	      this.netCoreRmemDefault = defaults.netCoreRmemDefault;
    	      this.netCoreRmemMax = defaults.netCoreRmemMax;
    	      this.netCoreSomaxconn = defaults.netCoreSomaxconn;
    	      this.netCoreWmemDefault = defaults.netCoreWmemDefault;
    	      this.netCoreWmemMax = defaults.netCoreWmemMax;
    	      this.netIpv4IpLocalPortRange = defaults.netIpv4IpLocalPortRange;
    	      this.netIpv4NeighDefaultGcThresh1 = defaults.netIpv4NeighDefaultGcThresh1;
    	      this.netIpv4NeighDefaultGcThresh2 = defaults.netIpv4NeighDefaultGcThresh2;
    	      this.netIpv4NeighDefaultGcThresh3 = defaults.netIpv4NeighDefaultGcThresh3;
    	      this.netIpv4TcpFinTimeout = defaults.netIpv4TcpFinTimeout;
    	      this.netIpv4TcpKeepaliveProbes = defaults.netIpv4TcpKeepaliveProbes;
    	      this.netIpv4TcpKeepaliveTime = defaults.netIpv4TcpKeepaliveTime;
    	      this.netIpv4TcpMaxSynBacklog = defaults.netIpv4TcpMaxSynBacklog;
    	      this.netIpv4TcpMaxTwBuckets = defaults.netIpv4TcpMaxTwBuckets;
    	      this.netIpv4TcpTwReuse = defaults.netIpv4TcpTwReuse;
    	      this.netIpv4TcpkeepaliveIntvl = defaults.netIpv4TcpkeepaliveIntvl;
    	      this.netNetfilterNfConntrackBuckets = defaults.netNetfilterNfConntrackBuckets;
    	      this.netNetfilterNfConntrackMax = defaults.netNetfilterNfConntrackMax;
    	      this.vmMaxMapCount = defaults.vmMaxMapCount;
    	      this.vmSwappiness = defaults.vmSwappiness;
    	      this.vmVfsCachePressure = defaults.vmVfsCachePressure;
        }

        public Builder fsAioMaxNr(@Nullable Integer fsAioMaxNr) {
            this.fsAioMaxNr = fsAioMaxNr;
            return this;
        }
        public Builder fsFileMax(@Nullable Integer fsFileMax) {
            this.fsFileMax = fsFileMax;
            return this;
        }
        public Builder fsInotifyMaxUserWatches(@Nullable Integer fsInotifyMaxUserWatches) {
            this.fsInotifyMaxUserWatches = fsInotifyMaxUserWatches;
            return this;
        }
        public Builder fsNrOpen(@Nullable Integer fsNrOpen) {
            this.fsNrOpen = fsNrOpen;
            return this;
        }
        public Builder kernelThreadsMax(@Nullable Integer kernelThreadsMax) {
            this.kernelThreadsMax = kernelThreadsMax;
            return this;
        }
        public Builder netCoreNetdevMaxBacklog(@Nullable Integer netCoreNetdevMaxBacklog) {
            this.netCoreNetdevMaxBacklog = netCoreNetdevMaxBacklog;
            return this;
        }
        public Builder netCoreOptmemMax(@Nullable Integer netCoreOptmemMax) {
            this.netCoreOptmemMax = netCoreOptmemMax;
            return this;
        }
        public Builder netCoreRmemDefault(@Nullable Integer netCoreRmemDefault) {
            this.netCoreRmemDefault = netCoreRmemDefault;
            return this;
        }
        public Builder netCoreRmemMax(@Nullable Integer netCoreRmemMax) {
            this.netCoreRmemMax = netCoreRmemMax;
            return this;
        }
        public Builder netCoreSomaxconn(@Nullable Integer netCoreSomaxconn) {
            this.netCoreSomaxconn = netCoreSomaxconn;
            return this;
        }
        public Builder netCoreWmemDefault(@Nullable Integer netCoreWmemDefault) {
            this.netCoreWmemDefault = netCoreWmemDefault;
            return this;
        }
        public Builder netCoreWmemMax(@Nullable Integer netCoreWmemMax) {
            this.netCoreWmemMax = netCoreWmemMax;
            return this;
        }
        public Builder netIpv4IpLocalPortRange(@Nullable String netIpv4IpLocalPortRange) {
            this.netIpv4IpLocalPortRange = netIpv4IpLocalPortRange;
            return this;
        }
        public Builder netIpv4NeighDefaultGcThresh1(@Nullable Integer netIpv4NeighDefaultGcThresh1) {
            this.netIpv4NeighDefaultGcThresh1 = netIpv4NeighDefaultGcThresh1;
            return this;
        }
        public Builder netIpv4NeighDefaultGcThresh2(@Nullable Integer netIpv4NeighDefaultGcThresh2) {
            this.netIpv4NeighDefaultGcThresh2 = netIpv4NeighDefaultGcThresh2;
            return this;
        }
        public Builder netIpv4NeighDefaultGcThresh3(@Nullable Integer netIpv4NeighDefaultGcThresh3) {
            this.netIpv4NeighDefaultGcThresh3 = netIpv4NeighDefaultGcThresh3;
            return this;
        }
        public Builder netIpv4TcpFinTimeout(@Nullable Integer netIpv4TcpFinTimeout) {
            this.netIpv4TcpFinTimeout = netIpv4TcpFinTimeout;
            return this;
        }
        public Builder netIpv4TcpKeepaliveProbes(@Nullable Integer netIpv4TcpKeepaliveProbes) {
            this.netIpv4TcpKeepaliveProbes = netIpv4TcpKeepaliveProbes;
            return this;
        }
        public Builder netIpv4TcpKeepaliveTime(@Nullable Integer netIpv4TcpKeepaliveTime) {
            this.netIpv4TcpKeepaliveTime = netIpv4TcpKeepaliveTime;
            return this;
        }
        public Builder netIpv4TcpMaxSynBacklog(@Nullable Integer netIpv4TcpMaxSynBacklog) {
            this.netIpv4TcpMaxSynBacklog = netIpv4TcpMaxSynBacklog;
            return this;
        }
        public Builder netIpv4TcpMaxTwBuckets(@Nullable Integer netIpv4TcpMaxTwBuckets) {
            this.netIpv4TcpMaxTwBuckets = netIpv4TcpMaxTwBuckets;
            return this;
        }
        public Builder netIpv4TcpTwReuse(@Nullable Boolean netIpv4TcpTwReuse) {
            this.netIpv4TcpTwReuse = netIpv4TcpTwReuse;
            return this;
        }
        public Builder netIpv4TcpkeepaliveIntvl(@Nullable Integer netIpv4TcpkeepaliveIntvl) {
            this.netIpv4TcpkeepaliveIntvl = netIpv4TcpkeepaliveIntvl;
            return this;
        }
        public Builder netNetfilterNfConntrackBuckets(@Nullable Integer netNetfilterNfConntrackBuckets) {
            this.netNetfilterNfConntrackBuckets = netNetfilterNfConntrackBuckets;
            return this;
        }
        public Builder netNetfilterNfConntrackMax(@Nullable Integer netNetfilterNfConntrackMax) {
            this.netNetfilterNfConntrackMax = netNetfilterNfConntrackMax;
            return this;
        }
        public Builder vmMaxMapCount(@Nullable Integer vmMaxMapCount) {
            this.vmMaxMapCount = vmMaxMapCount;
            return this;
        }
        public Builder vmSwappiness(@Nullable Integer vmSwappiness) {
            this.vmSwappiness = vmSwappiness;
            return this;
        }
        public Builder vmVfsCachePressure(@Nullable Integer vmVfsCachePressure) {
            this.vmVfsCachePressure = vmVfsCachePressure;
            return this;
        }        public SysctlConfigResponse build() {
            return new SysctlConfigResponse(fsAioMaxNr, fsFileMax, fsInotifyMaxUserWatches, fsNrOpen, kernelThreadsMax, netCoreNetdevMaxBacklog, netCoreOptmemMax, netCoreRmemDefault, netCoreRmemMax, netCoreSomaxconn, netCoreWmemDefault, netCoreWmemMax, netIpv4IpLocalPortRange, netIpv4NeighDefaultGcThresh1, netIpv4NeighDefaultGcThresh2, netIpv4NeighDefaultGcThresh3, netIpv4TcpFinTimeout, netIpv4TcpKeepaliveProbes, netIpv4TcpKeepaliveTime, netIpv4TcpMaxSynBacklog, netIpv4TcpMaxTwBuckets, netIpv4TcpTwReuse, netIpv4TcpkeepaliveIntvl, netNetfilterNfConntrackBuckets, netNetfilterNfConntrackMax, vmMaxMapCount, vmSwappiness, vmVfsCachePressure);
        }
    }
}
