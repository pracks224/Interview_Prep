**Table of content:**
 - [Responsibilitiy-1 : Generate regular reports on system performance, uptime, and security compliance.](#report)


   
<a id="report"></a> 
### Reports on system performance, uptime, and security compliance
#### Key Metrics:
  - CPU usage
      - CPU Utilization: The percentage of time the CPU is actively processing instructions. High utilization may indicate that the CPU is under heavy load.
      - CPU Load: The number of processes waiting to be executed by the CPU. A high load can indicate the system is overburdened.
      - Idle Time: The percentage of time the CPU is not processing any instructions. High idle time may indicate underutilization.
        ##### Tools for Monitoring CPU Usage
          - Built-in System Tools
              - Windows: Task Manager, Performance Monitor (perfmon)
              - Linux: top, htop, vmstat, mpstat, sar
              - macOS: Activity Monitor
          - Open-Source Tools
              - Nagios: Can monitor CPU usage via plugins and send alerts when thresholds are breached.
              - Prometheus: Collects metrics including CPU usage. Often used with Grafana for visualization.
              - Zabbix: Offers templates for monitoring CPU usage across various platforms.
          - Commercial Tools
              - Datadog: Provides detailed insights and alerting for CPU usage.
              - New Relic: Application performance monitoring including CPU metrics.
              - SolarWinds: Comprehensive infrastructure monitoring including CPU performance.

  - Memory utilization
  - Disk I/O
  - Network throughput
  - Application response times
  - Error Rates
#### Monitoring Tools:
  - Open-Source Tools: Nagios, Zabbix, Prometheus, Grafana
  - Commercial Tools: SolarWinds, New Relic, Datadog, Splunk,Datadog
#### Set Alert and Notification 
  - Use email, SMS, or integrated communication tools like Slack for notifications.

